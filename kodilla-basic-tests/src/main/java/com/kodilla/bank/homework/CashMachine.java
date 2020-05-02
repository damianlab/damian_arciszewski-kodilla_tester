package com.kodilla.bank.homework;

public class CashMachine { // Ma zawierac liste transakcji

    private int[] values; // Deklaracja tablicy
    private int size;


    public CashMachine() {
        this.size = 0;
        this.values = new int[0]; // Tabela na poczatku przyjmuje wartosc 0- brak operacji

    }
    public void add(int value) { // Metoda dodajaca nowe wartosci do tabeli i zwiekszajaca jej rozmiar

       // wymagany warunek dla akceptacji tranzakcji w zaleznosi od dostepnych srodkow w bankomacie

        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length); // Metoda pozwala na skopiowanie tablicy zrodlowej do tablicy docelowej,
        newTab[this.size - 1] = value; // W kolejnej linii przypisujemy nową wartość do ostatniego elementu w tablicy (konieczne było odjęcie cyfry jeden od rozmiaru tablicy, indeksy liczymy od zera)
        this.values = newTab; // Ostatnia linia to przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie.
    }

    public int[] getValues() { // metoda zwracajaca dlugosc tabeli
        return values;
    } // Metoda zwraca wartosci wpisane do tabeli

    public double getCashAmount() { // Dodalismy metoda zwracajaca wartosc na jakaprzeprowadzono tranzakcje
         double cashAmount =0;

        for(int i = 0; i < this.values.length; i++) {
            cashAmount += this.values[i];
        }
        return cashAmount;

    }
    public double getAvarage() { // dodalismy metoda zwracajaca srednia ocen
       if (this.values.length == 0) {  // test nie zadzialal ze wzgledu na niedozwolone dzielenie przez 0
            return 0;
        }
/*
        double avarage =0;

        for(int i = 0; i < this.values.length; i++) {
            avarage += this.values[i];
        }*/
        return getCashAmount()/this.values.length;


    }
}

