package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    WeatherService weatherService;
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Location location1 = Location.CRACOW;
    Location location2 = Location.WARSAW;
    Info info = Mockito.mock(Info.class);
    Alert alert = Mockito.mock(Alert.class);

    @BeforeEach
    public void beforeEach() {
        weatherService = new WeatherService();
    }

    @Test
    public void notSubscribedClientShouldNotReceiveInfo () {
        weatherService.sendInfoToAll(info);
        Mockito.verify(client1, Mockito.never()).receive(info);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveAlert () {
        weatherService.sendAlertToLocationClients(location1, alert);
        Mockito.verify(client1, Mockito.never()).receive(alert);
    }

    @Test
    public void subscribedClientsShouldReceiveInfo() {
        weatherService.addSubscriberToLocation(client1,location1);

        weatherService.sendInfoToAll(info);

        Mockito.verify(client1, Mockito.times(1)).receive(info);
        Mockito.verify(client2, Mockito.never()).receive(info);
    }

    @Test
    public void subscribedClientsToLocationShouldReceiveAlert() {
        weatherService.addSubscriberToLocation(client1,location1);
        weatherService.addSubscriberToLocation(client2,location2);

        weatherService.sendAlertToLocationClients(location1, alert);

        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.never()).receive(alert);
    }

    @Test
    public void unsubscribedClientFromLocationShouldNotReceiveAlert() {
        weatherService.addSubscriberToLocation(client1,location1);
        weatherService.addSubscriberToLocation(client2,location1);

        weatherService.removeSubscriberFromLocation(client2,location1);

        weatherService.sendAlertToLocationClients(location1, alert);

        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.never()).receive(alert);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveAlert() {
        weatherService.addSubscriberToLocation(client1,location1);
        weatherService.addSubscriberToLocation(client1,location2);
        weatherService.addSubscriberToLocation(client2,location1);

        weatherService.removeSubscriber(client1);

        weatherService.sendAlertToLocationClients(location1, alert);

        Mockito.verify(client2, Mockito.times(1)).receive(alert);
        Mockito.verify(client1, Mockito.never()).receive(alert);
    }
    @Test
    public void unsubscribedClientShouldNotReceiveInfo() {
        weatherService.addSubscriberToLocation(client1,location1);
        weatherService.addSubscriberToLocation(client1,location2);
        weatherService.addSubscriberToLocation(client2,location1);

        weatherService.removeSubscriber(client1);

        weatherService.sendInfoToAll(info);

        Mockito.verify(client2, Mockito.times(1)).receive(info);
        Mockito.verify(client1, Mockito.never()).receive(info);
    }

    @Test
    public void clientsShouldNotReceiveAlertForNotExistingLocation() {
        weatherService.addSubscriberToLocation(client1,location1);
        weatherService.addSubscriberToLocation(client2,location1);

        weatherService.removeLocation(location1);

        weatherService.sendAlertToLocationClients(location1, alert);

        Mockito.verify(client2, Mockito.never()).receive(alert);
        Mockito.verify(client1, Mockito.never()).receive(alert);
    }
}