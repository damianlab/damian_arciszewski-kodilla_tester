package com.kodilla.collections.adv.immutable.homework;

import java.util.Objects;

public class Car {
    private String a;
    private String b;

    public Car(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getA(), car.getA()) &&
                Objects.equals(getB(), car.getB());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }

    @Override
    public String toString() {
        return "Car{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}