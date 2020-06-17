package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1/1/2020"));
        warehouse.addOrder(new Order("2/2/2020"));
        warehouse.addOrder(new Order("3/3/2020"));
        warehouse.addOrder(new Order("4/4/2020"));

        try {
            Order order = warehouse.getOrder("1/5/2020");
            System.out.println("Existing order: " + order);
        } catch (OrderDoesntExistException e) {
            System.out.println("Order can not be found");
        } finally {
            System.out.println("Search completed");
        }

    }
}
