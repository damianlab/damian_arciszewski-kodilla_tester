package com.kodilla.abstracts.homework;

public abstract class Job {
   private double salary;
   private String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public double getSalary() {
        return salary;
    }
    public String getResponsibilities() {
        return responsibilities;
    }




    public void displaySalery() { System.out.println("Salery: " + " " + getSalary()); }
    public void displayResponsibilities() { System.out.println("Responsibilities: " + " " + getResponsibilities()); }

}
