package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {

        Person person = new Person("Karol", 26, "Nurses", 1850 );
        Person person1 = new Person("Monika", 28, "Physiotherapist", 1950);

        Nurses nurses = new Nurses();
        nurses.displayNameOfJob();
        nurses.getResponsibilities();

    }
}
