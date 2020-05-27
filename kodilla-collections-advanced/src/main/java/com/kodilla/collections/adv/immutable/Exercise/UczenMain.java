package com.kodilla.collections.adv.immutable.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class UczenMain {
    public static void main(String[] args) {

        Integer a = 112; // tworzymy zmienna a typu Integer
        Integer b = 112;
        System.out.println(a == b); // == porownuje zawartosc a i b - a te zawieraja adresy wskazywanych obiektow.
// porownanie zwraca false
        System.out.println(a.equals(b));


        LinkedList<String> uczen = new LinkedList<>();
        uczen.add("Karol");
        uczen.add("Ada");
        uczen.add("Mario");

        uczen.remove(0);

        for(String e : uczen) {
            System.out.println(e);
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Poniedzialek");
        map.put(5, "Piatek");
        map.put(7, "Niedziela");

        System.out.println(map.get(5));
        for(String e : map.values()) { // potrzebna jest dodatkowa metoda okreslajaca do jakiej wartosci sie odwolujemy
            System.out.println(e);
            System.out.println("-------------");
        }


        Uczen u1 = new Uczen();
        u1.setOcena(4);
        u1.setNazwisko("Waldek");
        u1.setNazwisko("Karrol");

        // wywolanie konstruktora na rzecz klasy uczen, nawiasy puste poniewarz wystepuje konstruktor domyslny
        // tworzenie instancji jednego obiektu
       // u1.nazwisko = "Nowak"; // na rzecz tego obiektu po przez operator kropki mozemy odwolac sie do skladowych ego obiektu
      //  u1.ocena = 6;

        // zmieana poleda ze do zmiennych musimy odwolac sie getterami i setterami


        // System.out.println(u1.nazwisko + u1.ocena);
    System.out.println(u1.getNazwisko() + u1.getOcena());
    // settey i gettery pozwalaja tworzyc logike biznesowa

        ArrayList<String> uczniowie = new ArrayList<>();
        uczniowie.add("Seba");
        uczniowie.add("Maciej");
        uczniowie.add("Jola");
        uczniowie.add("Maciej");

        for(String uczniowiePrint : uczniowie)
        System.out.println("ArrayList with duplicates: " + uczniowiePrint);
        System.out.println("-------");
        // to remove duplicants
        ArrayList<String> newList = Uczen.removeDuplicates(uczniowie);
        for(String uczniowieSet : newList)
            System.out.println("ArrayList with duplicates removed: " + uczniowieSet);
        System.out.println("-------");

        ArrayList<String> newUczniowie = Uczen.checkAddres(uczniowie);
        for(String uczniowieClass : newUczniowie)

            System.out.println("ArrayList with duplicates removed: " + uczniowieClass );

        // first index of Maciej

        int position1 = newUczniowie.indexOf("Seba");
        int position2 = newUczniowie.lastIndexOf("Seba");
        System.out.println("The first occurance of Seba is: " + position1);
        System.out.println("The last occurance of Seba is: " + position2);

        // size of array  list
        int n = 5;
//declaring ArrayList with initial size n
        ArrayList<Integer> uczenSzkoly = new ArrayList<Integer>(n);

        for (int  i=1; i<=n; i++)
            uczenSzkoly.add(i);
        System.out.println(uczenSzkoly);

        uczenSzkoly.remove(3);
        System.out.println(uczenSzkoly);

        for(int i=0; i<uczenSzkoly.size(); i++)
        System.out.print(uczenSzkoly.get(i)+" ");
}
}
