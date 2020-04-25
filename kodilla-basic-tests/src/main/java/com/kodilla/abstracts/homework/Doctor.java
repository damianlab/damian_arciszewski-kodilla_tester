package com.kodilla.abstracts.homework;

public class Doctor extends Job{

    public Doctor() {
        super("Doctor", 2600);
    }
        @Override
        public void getResponsibilities() {
            System.out.println("-undertaking patient consultations and physical examinations" + "\n-organising workloads" + "\n -performing surgical procedures"); }

}
