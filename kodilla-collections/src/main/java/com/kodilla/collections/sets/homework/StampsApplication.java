package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Penny Black", 22, 16, Boolean.TRUE));
        stamps.add(new Stamp("Hawaiian Missionaries", 19, 13, Boolean.TRUE));
        stamps.add(new Stamp("Poczta Polska 1947", 16, 22, Boolean.FALSE));
        stamps.add(new Stamp("Kopernik", 23, 16,Boolean.TRUE));
        stamps.add(new Stamp("Penny Black", 22, 16, Boolean.TRUE));

        System.out.println(stamps.size());
        for(Stamp stamp : stamps)
            System.out.println(stamp);
    }
}

