package com.kodilla.abstracts.homework;

public abstract class Job {
    String nameOfJob;
    private double salary;

    public Job(String nameOfJob, double salary) {
        this.nameOfJob = nameOfJob;
        this.salary = salary;
    }

    public String getNameOfJob() {
        return nameOfJob;
    }

    public double getSalary() {
        return salary;
    }


    public void displayNameOfJob() { System.out.println("Job title: " + " " + getNameOfJob()); }
    public abstract void getResponsibilities();

}
