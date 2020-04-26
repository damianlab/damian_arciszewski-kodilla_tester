package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {

Nurses nurses1 = new Nurses();
Physiotherapist physiotherapist1 = new Physiotherapist();
Doctor doctor1 = new Doctor();

        Person person[] = new Person[4];

        person[0] = new Person("Karol", 26, nurses1);
        person[1] = new Person("Monika", 28, physiotherapist1);
        person[2] = new Person("Tomek", 26, doctor1);
        person[3] = new Person("Doda", 28, nurses1);

        Nurses nurses = new Nurses();
        nurses.displayResponsibilities();
        nurses.displaySalery();

        Physiotherapist physiotherapist = new Physiotherapist();
        Doctor doctor = new Doctor();


        int i = 0;
        for (i = 0; i <=3 ; i++) {
            if (person[i].job.equals(nurses1))
                System.out.println("Name: " + person[i].firstName + "\nOccupation: Nurse" + "\nResponsibilities: " + nurses.getResponsibilities());

            if (person[i].job.equals(physiotherapist1))
                System.out.println("Name: " + person[i].firstName + "\nOccupation: Physiotherapist" + "\nResponsibilities: " + physiotherapist.getResponsibilities());

            if (person[i].job.equals(doctor1))
                System.out.println("Name: " + person[i].firstName + "\nOccupation: Doctor" + "\nResponsibilities: " + doctor.getResponsibilities());
        }
        }

    }
