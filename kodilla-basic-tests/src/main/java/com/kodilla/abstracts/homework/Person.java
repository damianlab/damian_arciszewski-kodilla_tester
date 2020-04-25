package com.kodilla.abstracts.homework;

public class Person extends Job {

    private String firstName;
    private int age;

    public Person( String firstName, int age, String nameOfJob, double salary) {
        super(nameOfJob, salary);
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void dispData() { System.out.println(getFirstName() + getSalary() + getNameOfJob());
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Check");
    }

    }

