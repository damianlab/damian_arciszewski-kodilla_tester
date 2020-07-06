package com.kodilla.mockito.exercises;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = info -> System.out.println("@ " + info.getMessage());
        Customer customer2 = info -> System.out.println("# " + info.getMessage());

        ShopService shopService = new ShopService();
        shopService.addSubscriberToProduct(customer1, Product.PRALKA);
        shopService.addSubscriberToProduct(customer2, Product.ZEGAREK);
        shopService.sendInfoToProductCustomer(product -> "Produkt dostępny");

        shopService.delivery(Arrays.asList(Product.PRALKA,Product.SUSZARKA, Product.ZEGAREK));
        shopService.sellProducts(Product.PRALKA, 1);
        shopService.sendInfoToProductCustomer(product -> "Produkt dostępny !!!");

    }
}
