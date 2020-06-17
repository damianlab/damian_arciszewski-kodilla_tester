package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {

    /*Klasę Warehouse, która będzie przechowywała kolekcję zamówień. Napisz metody addOrder(Order order) – dodającą zamówienie do kolekcji, oraz metodę
    Order getOrder(String number), która wyszuka w kolekcji zamówienie o podanym numerze (użyj Stream) i je zwróci.
    W przypadku braku zamówienia w kolekcji rzuć wyjątkiem stworzonym w kroku pierwszym. */

    // addOrder(Order order)
    // getOrder(String number)

    private Set<Order> orders;

    public Warehouse() {
        this.orders = new HashSet<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException {
        return  orders.stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
    }
}
   


