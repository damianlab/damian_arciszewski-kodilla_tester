package com.kodilla.collections.adv.immutable.Exercise;

public class LiczbaMain {
    public static void main(String[] args) {  // klasy i obiekty


        //int liczba = 50;
     //   System.out.println("Liczba przed: " + liczba); // konkatenacja zlaczenie
     //   zmien(liczba); // wywolanie funkcji niczego nie zmienilo
    //    System.out.println("Liczba po: " + liczba); // konkatenacja zlaczenie

        // co stanie sie z obiektem- tworzymy obiekt na klasie liczba
        Liczba oliczba = new Liczba(); // new aby wywolac konstruktor
        oliczba.liczba = 50; // cos nadac liczbie za pomoca operatora kropki by odwolac sie do elementu czyli zmiennej liczba zapisanej w klasie Liczba
        oliczba.set = 100; // moge wywolac inne zmienne w tym samym obiekcie z klasy Liczba
        System.out.println("Obiekt Liczba przed: " + oliczba.liczba); // konkatenacja zlaczenie
// teraz mamy przepuscic obiekt przez metode
        zmien(oliczba);
        System.out.println("Obiekt Liczba po: " + oliczba.liczba); // konkatenacja zlaczenie

    }
    public static void zmien(int liczba){  // statyczna by mozna bylo ja od razu wywolac
        liczba = -1; // metoda ma modyfikowac zmienna na -1
    }
    public  static void zmien(Liczba oblicza) { // oliczba to obiekt liczba
        oblicza.liczba = oblicza.set -1; // wymagam cos co jest zbudowane na klasie liczba
        // oliczba - jest dowolnym nowym okersleniem i temu bede chcial przypisac cos z klasy liczba jak w nawiasie. w tym przypadku mamy jedna zmienna liczba
        // dlatego oliczba.liczba
        // pierwsza metoda na bazie prostedo a druga zlozonego
    }
}
