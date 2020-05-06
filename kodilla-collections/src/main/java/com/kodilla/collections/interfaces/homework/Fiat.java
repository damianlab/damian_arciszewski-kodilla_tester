package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car{
    private int[] values;
    private int size;

    public Fiat() {
        this.size = 0;
        this.values = new int[0];
    }

    public void increaseSpeed() { // Metoda zwiekszajaca predkosc
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(values, 0, newTab, 0, values.length);
            newTab[this.size - 1] = 4;
            this.values = newTab;
    }
    public void decreaseSpeed() { // Metoda zmniejszakaca predkosc
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(values, 0, newTab, 0, values.length);
            newTab[this.size - 1] = -3;
            this.values = newTab;
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
