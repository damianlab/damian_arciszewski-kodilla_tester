package com.kodilla.collections.adv.exercises.homework;

import java.util.List;

public class FlightApp {
    public static void main(String[] args) {
        List<Flight> flights = FlightRepository.getFlightsTable();

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> fromWarszawa = flightFinder.findFlightsFrom("Warszawa");
        printFlights(fromWarszawa);

        List<Flight> toBarcelona = flightFinder.findFlightsTo("Barcelona");
        printFlights(toBarcelona);

        System.out.println(flights.size());
        for(Flight lf : flights)
            System.out.println(lf.getDeparture() + " - " + lf.getArrival());

    }
    private static void printFlights(List<Flight> flights) {
        System.out.println(flights.size());
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
