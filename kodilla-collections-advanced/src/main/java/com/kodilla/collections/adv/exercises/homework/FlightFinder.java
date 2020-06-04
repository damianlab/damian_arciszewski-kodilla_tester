package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    // Wywolanie metody
    List<Flight> flights = FlightRepository.getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightFrom = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure)) {
                flightFrom.add(flight);
            }
        }
    return flightFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightTo = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival)) {
                flightTo.add(flight);
            }
        }
       return flightTo;
    }
}
