package com.kodilla.mockito.exercises;

import com.kodilla.mockito.homework.Client;
import com.kodilla.mockito.homework.Location;

import java.util.*;
import java.util.function.Function;

public class ShopService {

    private Map<Product, Set<Customer>> productCustomer = new HashMap<>();
    private Map<Product, Integer> products = new HashMap<>();

    public void addSubscriberToProduct(Customer customer, Product product) {
        if (!productCustomer.containsKey(product)) {
            productCustomer.put(product, new HashSet<>(Arrays.asList(customer)));
        } else {
            productCustomer.get(product).add(customer);
        }
    }

    public void removeSubscriberFromProduct(Customer customer, Product product) {
        if (productCustomer.containsKey(product)) {
            productCustomer.get(product).remove(customer);
        }
    }

    public void sellProducts(Product product, Integer amount) {
        if (products.containsKey(product) && products.get(product)>= amount) {
            products.put(product, products.get(product) - amount);
        } else {
            throw new ProductNotInStockException("Product is not available (in such amount)");
        }
    }

    public void delivery(List<Product> newProducts) {
        for (Product p : newProducts) {
            if (!products.containsKey(p)) {
                products.put(p, 1);
            } else {
                products.put(p, products.get(p) + 1);
            }
        }
    }

    public void sendInfoToProductCustomer(Function<Product, String> infoMessage) {
        products.forEach((product, amount) -> {
            if (amount > 0) {
                if (productCustomer.containsKey(product)) {
                    productCustomer.get(product).forEach(customer -> customer.receive(
                            new Info(infoMessage.apply(product))
                    ));
                }
            }
        });
    }
}
