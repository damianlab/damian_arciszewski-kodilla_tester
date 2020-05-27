package com.kodilla.collections.adv.immutable.Exercise;

import java.util.ArrayList;

public class Uczen {
    // gettery i settery, chermetyzacja danych
    private String nazwisko;  // private - zmienna typu private nie widoczna
    private int ocena;

// po dodaniu

        public String getNazwisko() { // getter to metoda pozwalajac zwrocic wartosc zmiennej
        return this.nazwisko;
    }
        public void setNazwisko(String nazwisko) {
        //if(nazwisko.length() >= 2) { // dodalismy warunek rze tylko nazwisko z dlugoscia znakow wiecej niz 2
        this.nazwisko = nazwisko;
    }

        public int getOcena() {
        return this.ocena;
    }
        public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    // Function to remove duplicates from an ArrayList
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> uczniowie)
    {
        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();
// Traverse through the first list
        for (T element : uczniowie) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        // return the new list
        return newList;
    }

    public static <T> ArrayList<T> checkAddres(ArrayList<T> uczniowie)
    {
        // Create a new ArrayList
        ArrayList<T> newUczniowie = new ArrayList<T>();
// Traverse through the first list
        for (T element : uczniowie) {

            // If this element is not present in newList
            // then add it
          //  if (!newUczniowie.contains(element)) {

                newUczniowie.add(element);
            int position1 = newUczniowie.indexOf(element);
          //  }
        }

        // return the new list
        return newUczniowie;
    }



}
