package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1234"));
        warehouse.addOrder(new Order("1236"));
        warehouse.addOrder(new Order("1235"));

        try {
            System.out.println(warehouse.getOrder("1234"));
            System.out.println("Znaleziono zamowienie po numerze 1234");
        } catch (OrderDoesntExistException e) {
            System.out.println("Nie znaleziono zamowienia po numerze 1234");
//            e.printStackTrace();
        }
    }

}
