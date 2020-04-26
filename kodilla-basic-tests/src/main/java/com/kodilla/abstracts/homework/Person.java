package com.kodilla.abstracts.homework;

public class Person {

    public String firstName;
    public int age;
    public Job job;

    public Person( String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }


    }

