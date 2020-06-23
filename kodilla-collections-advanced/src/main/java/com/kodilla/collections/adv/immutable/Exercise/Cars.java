package com.kodilla.collections.adv.immutable.Exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>(Arrays.asList("Ford", "Fiat", "Opel" , "Mercedes" , "Chevrolet"));
        System.out.println(cars.stream().filter(s -> s.length() > 5).count());

        System.out.println(cars.stream().filter(s -> s.length() > 5).collect(Collectors.joining(", ")));

        System.out.println(cars.stream().map(String::length).reduce(Integer::sum).orElse(0));
    }
}
