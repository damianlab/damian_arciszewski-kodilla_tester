package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
        int speed;

        @Override
        public void increaseSpeed() { // metoda zwiekszajaca predkosc
            speed = speed + 5;
        }

        @Override
        public void decreaseSpeed() {  // metoda zmniejszajaca predkosc
            speed = speed - 4;

        }

        @Override
        public int getSpeed() { // metoda zwracająca prędkość
        return speed;
        }

    }


    /*
    private int[] values;
    private int size;

    public Ford() {
        this.size = 0;
        this.values = new int[0];
    }

    public void increaseSpeed() { // Metoda zwiekszajaca predkosc
         //if (value > 0 && value <40) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(values, 0, newTab, 0, values.length);
            newTab[this.size - 1] = 5;
            this.values = newTab;

    }
    public void decreaseSpeed() { // Metoda zmniejszakaca predkosc
        //if (value < 0) {
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
*/