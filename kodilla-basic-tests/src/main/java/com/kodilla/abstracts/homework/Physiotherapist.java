package com.kodilla.abstracts.homework;

public class Physiotherapist extends Job{

    public Physiotherapist() {
        super("Physiotherapist", 156);

    }

    @Override
    public void getResponsibilities() {
        System.out.println("-helping patients recover from accident, illness or injury" + "\n-organising therapeutic physical exercise sessions" + "\n -providing massages"); }

}
