package com.kodilla.collections.adv.immutable.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PaczkaMain {
    public static void main(String[] args) {
        Paczka paczka1 = new Paczka(2,2,2, 100);
        Paczka paczka2 = new Paczka(3,3,3, 120);

        List<Paczka> paczka = new ArrayList<>();
        paczka.add(paczka1);
        paczka.add(paczka2);

        paczka1.obliczBox(); {
            System.out.println(paczka1.obliczBox());
        }

        for (Paczka paczkaPrint : paczka) {
            System.out.println(paczkaPrint);
        }

        for (Paczka paczkaPrint : paczka) {
            System.out.println(paczkaPrint.obliczBox() - 2);
        }

        int a, b;
        boolean wyn;

        a = 10;
        b = 3;

        wyn = a < b;

        System.out.println(wyn);


    }
}
