package com.kodilla.collections.sets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTestSuite {

    private Order order = new Order("1/09/2020", "product", 3.8);

    @Test
    public void checkingGetQuantityOrder() {
        assertEquals(3.8, order.getQuantity(), 0.001);
    }

    @Test
    public void checkingGetProductNameOfOrder() {
        assertEquals("product", order.getProductName());
    }

    @Test
    public void checkingGetOrderNumberOfOrder() {
        assertEquals("1/09/2020", order.getOrderNumber());
    }
}