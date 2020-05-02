package com.kodilla.school;

public class Grades { // klasa bedzie rozpatrywac liste ocen

        private int[] values; // zdefiniowalismy tablice z zerową liczba elementow - na starcie uczen nie ma zadnych ocen
        private int size; // zmienna size

    public Grades() {
        this.size = 0;
        this.values = new int[0]; // tablica z 0 liczba elementow - na starcie uczen nie ma ocen
    }

    public void add(int value) { // dodalismy metode zwiekszajaca o 1 wartosc size opisujaca wielkosc tablicy
        this.size++;
        int[] newTab = new int[this.size]; // tworzymy nowa tablice z nowym rozmiarem
        System.arraycopy(values, 0, newTab, 0, values.length); // Metoda pozwala na skopiowanie tablicy zrodlowej do tablicy docelowej,
        newTab[this.size - 1] = value; // W kolejnej linii przypisujemy nową wartość do ostatniego elementu w tablicy (konieczne było odjęcie cyfry jeden od rozmiaru tablicy, indeksy liczymy od zera)
        this.values = newTab; // Ostatnia linia to przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie.
    }

    public int[] getValues() {
        return values;
    }

    public double getAverage() { // dodalismy metoda zwracajaca srednia ocen
        if (this.values.length == 0) {  // test nie zadzialal ze wzgledu na niedozwolone dzielenie przez 0
            return 0;
        }
        double sum = 0;

        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }
}
