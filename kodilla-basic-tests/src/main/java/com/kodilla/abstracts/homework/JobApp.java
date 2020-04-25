package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {


        Person person[] = new Person[4];

        person[0] = new Person("Karol", 26, "Nurses");
        person[1] = new Person("Monika", 28, "Physiotherapist");
        person[2] = new Person("Tomek", 26, "Nurses");
        person[3] = new Person("Doda", 28, "Doctor");

        Nurses nurses = new Nurses();
        nurses.displayResponsibilities();
        nurses.displaySalery();

        Physiotherapist physiotherapist = new Physiotherapist();
        Doctor doctor = new Doctor();

        int i = 0;
        for (i = 0; i <=3 ; i++) {
            if (person[i].job == "Nurses")
                System.out.println("Name: " + person[i].firstName + " " +"\nNurse responsibilities: " + nurses.getResponsibilities());

            if (person[i].job == "Physiotherapist")
                System.out.println("Name: " + person[i].firstName + " " + "\nPhysiotherapist responsibilities: " + physiotherapist.getResponsibilities());

            if (person[i].job == "Doctor")
                System.out.println("Name: " + person[i].firstName + " " + "\nDoctor responsibilities: " + doctor.getResponsibilities());
        }
        }

    }
