package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {

    private Map<Location, Set<Client>> locationClients = new HashMap<>();

    public void addSubscriberToLocation(Client client, Location location) {
        if (!locationClients.containsKey(location)) {
            locationClients.put(location, new HashSet<>(Arrays.asList(client)));
        } else {
            locationClients.get(location).add(client);
        }
    }

    public void removeSubscriberFromLocation(Client client, Location location) {
        if (locationClients.containsKey(location)) {
            locationClients.get(location).remove(client);
        }
    }

    public void removeSubscriber(Client client) {
        for (Set<Client> clients : locationClients.values()) {
            clients.remove(client);
        }
    }

    public void removeLocation(Location location) {
        locationClients.entrySet().removeIf(entry -> entry.getKey().equals(location));
    }

    public void sendInfoToAll(Info info) {
        locationClients.values().stream()
                .flatMap(Collection::stream).distinct()
                .forEach(client -> client.receive(info));
    }

    public void sendAlertToLocationClients(Location location, Alert alert) {
        if (locationClients.containsKey(location)) {
            locationClients.get(location).forEach(client -> client.receive(alert));
        }
    }

}
