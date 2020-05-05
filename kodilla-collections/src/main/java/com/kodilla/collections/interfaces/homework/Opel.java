package com.kodilla.collections.interfaces.homework;

public class Opel {
    private int[] values;
    private int size;

    public Opel() {
        this.size = 0;
        this.values = new int[0];
    }

    public void increaseSpeed(int value) { // Metoda zwiekszajaca predkosc
        if (value > 0 && value <40) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(values, 0, newTab, 0, values.length);
            newTab[this.size - 1] = value;
            this.values = newTab; }
    }
    public void decreaseSpeed(int value) { // Metoda zmniejszakaca predkosc
        if (value < 0) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(values, 0, newTab, 0, values.length);
            newTab[this.size - 1] = value;
            this.values = newTab; }
    }
    public int[] getValues() { // metoda zwracajaca dlugosc tabeli
        return values;
    }

    public int getSpeed() { // Odczyt predkosci
        int speed =0;

        for(int i = 0; i < this.values.length; i++) {
            speed += this.values[i];
        }
        return speed;

    }
}
