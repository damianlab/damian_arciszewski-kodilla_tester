package com.kodilla.mockito.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ShopServiceTestSuite {

    ShopService shopService;
    Customer customer1 = Mockito.mock(Customer.class);
    Customer customer2 = Mockito.mock(Customer.class);
    Product product1 = Product.PRALKA;
    Product product2 = Product.SUSZARKA;
    Product product3 = Product.ZEGAREK;

    @BeforeEach
    public void beforeEach() {
        shopService = new ShopService();
    }

    @Test
    public void notSubscribedCustomerShouldNotReceiveInfo () {
        shopService.delivery(Arrays.asList(product1, product2, product3));

        shopService.sendInfoToProductCustomer(product -> "Product " + product.name() + " is now available");

        verify(customer1, never()).receive(any(Info.class));
        verify(customer2, never()).receive(any(Info.class));
    }
    @Test
    public void subscribedCustomerShouldReceiveInfo () {
        shopService.addSubscriberToProduct(customer1, product1);
        shopService.addSubscriberToProduct(customer2, product2);
        shopService.addSubscriberToProduct(customer1, product2);
        shopService.delivery(Arrays.asList(product1, product2, product3));

        shopService.sendInfoToProductCustomer(product -> "Product " + product.name() + " is available");

        verify(customer1, times(2)).receive(any(Info.class));
        verify(customer2, times(1)).receive(any(Info.class));
    }

    @Test
    public void subscribedCustomerShouldNotReceiveInfoIfProductSold () {
        shopService.addSubscriberToProduct(customer1, product1);
        shopService.addSubscriberToProduct(customer2, product3);
        shopService.addSubscriberToProduct(customer1, product2);
        shopService.delivery(Arrays.asList(product1, product2, product3));
        shopService.sellProducts(product3, 1);

        shopService.sendInfoToProductCustomer(product -> "Product " + product.name() + " is available");

        verify(customer1, times(2)).receive(any(Info.class));
        verify(customer2, never()).receive(any(Info.class));
    }

    @Test
    public void shouldThrowExemptionIfProductNotInRequestedQuantity () {
        shopService.delivery(Arrays.asList(product1, product2, product3, product1));

        assertThrows(ProductNotInStockException.class, () -> shopService.sellProducts(product1, 3));
    }

    @Test
    public void shouldNotThrowExemptionIfProductInRequestedQuantity () {
        shopService.delivery(Arrays.asList(product1, product2, product3, product1));

        assertDoesNotThrow(() -> shopService.sellProducts(product1, 2));
    }
}