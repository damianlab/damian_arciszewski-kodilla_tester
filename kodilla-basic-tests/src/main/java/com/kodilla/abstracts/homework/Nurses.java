package com.kodilla.abstracts.homework;

public class Nurses extends Job {

    public Nurses() {
        super("Nurses", 134);

    }

    @Override
    public void getResponsibilities() {
        System.out.println("-assessing and planning nursing care requirements" + "\n-providing pre- and post-operation care");


    }
}