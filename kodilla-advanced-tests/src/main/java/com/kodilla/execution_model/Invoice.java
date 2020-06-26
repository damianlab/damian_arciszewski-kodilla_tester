package com.kodilla.execution_model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    // klasa będzie przechowywać listę pozycji
    List<Item> items = new ArrayList<>();

    //dodanie nowej pozycji do faktury
    public void addItem(Item item) {
        this.items.add(item);

    }
    //pobranie pozycji z faktury, jeśli przekazany indeks jest prawidłowy
    public Item getItem(int index) {
        if(index >= 0 && index < items.size()) {
            return this.items.get(index);
        }
        return null;
        }

    //usunięcie wszystkich pozycji z faktury
    public void clear() {
        this.items.clear();
    }

    //zwrócenie liczby pozycji na fakturze
    public int getSize() {
        return this.items.size();
    }
}
