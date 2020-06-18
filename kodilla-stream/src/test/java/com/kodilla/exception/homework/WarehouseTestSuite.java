package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    private Warehouse warehouse = new Warehouse();

    @Test
    public void testGetOrderExists () throws OrderDoesntExistException {
        // given
        warehouse.addOrder(new Order("1356"));
        warehouse.addOrder(new Order("1357"));
        warehouse.addOrder(new Order("1359"));
        warehouse.addOrder(new Order("1440"));

        // when
        Order result = warehouse.getOrder("1440");

        // then
        assertEquals("1440", result.getNumber());
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrderDoseNotExists() throws OrderDoesntExistException {
        // given
        warehouse.addOrder(new Order("1356"));
        warehouse.addOrder(new Order("1357"));
        warehouse.addOrder(new Order("1359"));
        warehouse.addOrder(new Order("1440"));
        // when
        warehouse.getOrder("1470");
    }
}