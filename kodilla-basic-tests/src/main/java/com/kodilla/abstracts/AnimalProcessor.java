package com.kodilla.abstracts;

public class AnimalProcessor {
    public void process(Animal animal) {// polimorfizm wywolanie: AnimalProcessor processor = new AnimalProcessor(); processor.process(dog);
        System.out.println("Animal has " + animal.getNumberOfLegs() + " legs");
        animal.giveVoice();
        //Metoda przyjmuje ogólny typ - każdy obiekt, który dziedziczy po Animal.
        //Wywołanie animal.getNumberOfLegs() sygnalizuje, że z konkretnego (przekazanego) obiektu chcemy wywołać metodę getNumberOfLegs().
        // Zapis mówi, że dana metoda ma zostać wywołana z każdego obiektu, który jest podtypem Animal.
        // polimorfizm nie mylic z kompozycja
        // metoda wywoluje jednozesnie gattera wpisanego w klasie parent i metode abstrakcyjna na glos zwierzaka
    }
}

