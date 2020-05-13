package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    /* Utwórz klasę Stamp reprezentującą znaczek pocztowy.
    Klasa powinna mieć pola na nazwę oraz wymiary znaczka, a także informację o tym, czy znaczek jest ostemplowany czy nie.
     */
    private String stampName;
    private int stampHeight;
    private int stampWidth;
    private Boolean stampStamped;

    public Stamp(String stampName, int stampHeight, int stampWidth, Boolean stampStamped) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampWidth = stampWidth;
        this.stampStamped = stampStamped;

    }

    public String getStampName() {
        return stampName;
    }

    public int getStampHeight() {
        return stampHeight;
    }

    public int getStampWidth() {
        return stampWidth;
    }

    public Boolean getStampStamped() {
        return stampStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampHeight=" + stampHeight +
                ", stampWidth=" + stampWidth +
                ", stampStamped=" + stampStamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return getStampHeight() == stamp.getStampHeight() &&
                getStampWidth() == stamp.getStampWidth() &&
                Objects.equals(getStampName(), stamp.getStampName()) &&
                Objects.equals(getStampStamped(), stamp.getStampStamped());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getStampHeight(), getStampWidth(), getStampStamped());
    }
}
