package com.kodilla.spring.basic.exercises.books;

public class User {

    private Long id;
    private String surname;
    private String name;
    private boolean isInHisDebt;

    public User(Long id, String surname, String name) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.isInHisDebt = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInHisDebt() {
        return isInHisDebt;
    }

    public void setInHisDebt(boolean inHisDebt) {
        isInHisDebt = inHisDebt;
    }
}
