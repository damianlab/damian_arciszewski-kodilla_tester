package com.kodilla.collections.adv.immutable.Exercise;

import java.util.Objects;

public class Paczka {
   // public static void main(String[] args) {
        private int dlugosc;
        private int szerokosc;
        private int wysokosc;
        private int wartosc;

    public Paczka(int dlugosc, int szerokosc, int wysokosc, int wartosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.wartosc = wartosc;
    }

    public int obliczBox() {
        return dlugosc*szerokosc*wysokosc;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paczka)) return false;
        Paczka paczka = (Paczka) o;
        return dlugosc == paczka.dlugosc &&
                szerokosc == paczka.szerokosc &&
                wysokosc == paczka.wysokosc &&
                wartosc == paczka.wartosc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dlugosc, szerokosc, wysokosc, wartosc);
    }

    @Override
    public String toString() {
        return "Paczka{" +
                "dlugosc=" + dlugosc +
                ", szerokosc=" + szerokosc +
                ", wysokosc=" + wysokosc +
                ", wartosc=" + wartosc +
                '}';
    }
}
