package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private String departure;
    private String arrival;

    // constructor

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    // gettery


    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    // equal

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDeparture(), flight.getDeparture()) &&
                Objects.equals(getArrival(), flight.getArrival());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeparture(), getArrival());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
