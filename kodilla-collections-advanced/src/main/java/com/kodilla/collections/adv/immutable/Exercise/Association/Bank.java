package com.kodilla.collections.adv.immutable.Exercise.Association;

public class Bank {
    private String name;
    //bank name do Association

    // konstruktor
    Bank(String name) {
        this.name = name;
    }

    // getter
    public String getBankName() {
        return this.name;
    }
}
