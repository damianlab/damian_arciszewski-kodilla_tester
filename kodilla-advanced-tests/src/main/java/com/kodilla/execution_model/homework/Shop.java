package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    //która będzie przechowywać kolekcję unikalnych zamówień.
    /*
    Nowo utworzona klasa powinna mieć następujące funkcjonalności:

dodanie nowego zamówienia,
zwrócenie listy zamówień z zakresu dwóch dat,
pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),
zwrócenie liczby zamówień,
zsumowanie wartości wszystkich zamówień.
     */
    List<Order> orders = new ArrayList<>();

    //dodanie nowej pozycji do faktury
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersFromToDate (LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(d -> d.getOrderDate().isAfter(from) && d.getOrderDate().isBefore(to))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersInValueRange (double lowerLimit, double topLimit) {
        return orders.stream()
                .filter(v -> v.getOrderValue() >= lowerLimit && v.getOrderValue() <= topLimit)
                .collect(Collectors.toList());
    }

    public int getOrdersSize() {
        return orders.size();
    }

    public double getOrdersTotalValue () {
        return orders.stream()
                .map(t -> t.getOrderValue())
                .mapToDouble(t -> t)
                .sum();
    }

    public Order getOrder(int index) {
        if(index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }
}
