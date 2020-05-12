package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();// zadeklaruj zmienną, rozpoczynając od wpisania nazwy typu, czyli List
        //Bezpośrednio po nazwie interfejsu musimy wskazać w nawiasach trójkątnych,
        //jakiego typu obiekty będą mogły być przechowywane w kolekcji. W naszym przypadku będzie to Square
        //Import do stworzonej przez nas wcześniej klasy Square jest potrzebny,
        // ponieważ znajduje się ona w innym pakiecie niż nasza klasa ShapesListApplication
        // teraz wpisz nazwę zmiennej, niech będzie to shapes - a nastepnie
        //  Przypiszmy także do tej zmiennej nowy obiekt klasy ArrayList

        // dodawanie obiektow klasy square
        //Square sq1 = new Square(10.0);
        //Square sq2 = new Square(5.0);
        //Square sq3 = new Square(1.0);
        //shapes.add(sq1);
        //shapes.add(sq2);
        // shapes.add(sq3);
        // Powyższy kod tworzy trzy obiekty: sq1, sq2, sq3, a następnie dodaje je do kolekcji shapes
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        for (Square square : shapes) {
            // W linii 15 uruchamiana jest pętla for-each na kolekcji shapes. W kolejnych iteracjach kolejne elementy z tej
            // kolekcji będą umieszczane w zmiennej square,
            // która jest typu Square (pętlę for-each najwygodniej czyta się od prawej strony do lewej).
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }


        /*for (int n = 0; n < shapes.size(); n++) { // brakowalo nawiasu - uuuu
            Square square = shapes.get(n);
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        } */
    }
}
