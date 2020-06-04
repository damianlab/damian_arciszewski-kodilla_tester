package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        //List<Flight> flights = FlightRepository.getFlightsTable();

        // when
        List<Flight> resultFlightsFrom = flightFinder.findFlightsFrom("Warszawa");

        // then
        List<Flight> expectedFlight = new ArrayList<>();

        expectedFlight.add(new Flight("Warszawa", "Singapur"));
        expectedFlight.add(new Flight("Warszawa", "Londyn"));
        expectedFlight.add(new Flight("Warszawa", "Barcelona"));
        assertEquals(expectedFlight, resultFlightsFrom);

    }
    @Test
    public void testFindFlightsTo() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        //List<Flight> flights = FlightRepository.getFlightsTable();

        // when
        List<Flight> resultFlightsTo = flightFinder.findFlightsTo("Barcelona");

        // then
        List<Flight> expectedFlight = new ArrayList<>();
        expectedFlight.add(new Flight("Berlin", "Barcelona"));
        expectedFlight.add(new Flight("Warszawa", "Barcelona"));
        assertEquals(expectedFlight, resultFlightsTo);

    }

    @Test
    public void testDestinationNotOnList() {
        // given
        FlightFinder flightFinder = new FlightFinder();
       // List<Flight> flights = FlightRepository.getFlightsTable();

        // when
        List<Flight> resultFlightsTo = flightFinder.findFlightsTo("Kraków");

        // then
        List<Flight> expectedFlight = new ArrayList<>();
        assertEquals(expectedFlight, resultFlightsTo);

    }

    @Test
    public void testDepartureNotOnList() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        //List<Flight> flights = FlightRepository.getFlightsTable();

        // when
        List<Flight> resultFlightsFrom = flightFinder.findFlightsFrom("Szczecin");

        // then
        List<Flight> expectedFlight = new ArrayList<>();
        assertEquals(expectedFlight, resultFlightsFrom);

    }

    @Test
    public void testDepartureEmptyRequest() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        //List<Flight> flights = FlightRepository.getFlightsTable();

        // when
        List<Flight> resultFlightsFrom = flightFinder.findFlightsFrom(" ");

        // then
        List<Flight> expectedFlight = new ArrayList<>();
        assertEquals(expectedFlight, resultFlightsFrom);

    }
}
