package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShopTestSuite {

Shop shop = new Shop ();
Order order01 = new Order(153, LocalDate.of(2018,5,18), "karol");
Order order02 = new Order(145, LocalDate.of(2018, 5, 17), "john");
Order order03 = new Order(160, LocalDate.of(2020, 6, 15), "jas");
Order order04 = new Order(120, LocalDate.of(2019, 6, 15), "jas");
Order order05 = new Order(1530, LocalDate.of(2017, 4, 1), "sara");

    @Test
    public void shouldAddOrdersToShop() {
        //Given

        //shop.addOrder(order01);
        //shop.addOrder(order02);
        //shop.addOrder(order03);
        //shop.addOrder(order04);
        //shop.addOrder(order05);

        //when
        int numberOfOrders = shop.getOrdersSize();

        //Then
        assertEquals(5, numberOfOrders);

    }


    @Test
    public  void shouldGetOrdersFromToDate(){
        // Given
        // When
        List<Order> orders = shop.getOrdersFromToDate(LocalDate.of(2016,5,18), LocalDate.of(2019, 4, 12));
        // Then
        assertEquals(3, orders.size());

    }

    @Test
    public  void shoulReturnEmptyListIfDatesOutOfRange(){
        // Given
        // When
        List<Order> emptyList = shop.getOrdersFromToDate(LocalDate.of(2013,5,18), LocalDate.of(2015, 4, 12));
        // Then
        assertEquals(Collections.emptyList(), emptyList);

    }

    @Test
    public void shouldGetOrdersInValueRange (){
        //Given

        //When
        List<Order> orders = shop.getOrdersInValueRange(40, 150);

        assertEquals(2, orders.size());

    }

    @Test
    public void shouldReturnEmptyListWhenNoOrdersInValueRange() {
        // Given

        // invoice.addItem(milk);
        // invoice.addItem(eggs);
        // invoice.addItem(bread);

        //when
        List<Order> emptyList = shop.getOrdersInValueRange(40, 60);

        //Then
        assertEquals(Collections.emptyList(), emptyList);
    }

    @Test
    public void shouldGetOrdersTotalValue () {
        // Given

        // When
        shop.getOrdersTotalValue();

        // Then
        assertEquals(2108, shop.getOrdersTotalValue(), 0.01);
        }

    @Test
    public void shouldGetExistingOrder() {
        // Given

        // invoice.addItem(milk);
        // invoice.addItem(eggs);
        // invoice.addItem(bread);

        // When
        Order result = shop.getOrder(2);

        // Then
        assertEquals("jas", result.getUserLogin());
        assertEquals(160, result.getOrderValue());

    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order01);
        shop.addOrder(order02);
        shop.addOrder(order03);
        shop.addOrder(order04);
        shop.addOrder(order05);
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}