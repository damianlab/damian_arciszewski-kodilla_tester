package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

public static List<Flight> getFlightsTable() {
    List<Flight> flights = new ArrayList<>();
    flights.add(new Flight("Berlin", "Barcelona"));
    flights.add(new Flight("Barcelona", "Singapur"));
    flights.add(new Flight("Sarajewo", "Warszawa"));
    flights.add(new Flight("Warszawa", "Singapur"));
    flights.add(new Flight("Odessa", "Bruksela"));
    flights.add(new Flight("Bruksela", "Warszawa"));
    flights.add(new Flight("Warszawa", "Londyn"));
    flights.add(new Flight("Warszawa", "Barcelona"));
    return flights;
}
}
