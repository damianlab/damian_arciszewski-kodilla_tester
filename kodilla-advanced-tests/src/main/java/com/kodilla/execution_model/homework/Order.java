package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    //która będzie przechowywać dane zamówienia: wartość zamówienia, datę oraz login osoby dokonującej zamówienia.

    private double orderValue;
    private LocalDate orderDate;
    private String userLogin;

    public Order(double orderValue, LocalDate orderDate, String userLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.userLogin = userLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getUserLogin() {
        return userLogin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                ", userLogin='" + userLogin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.getOrderValue(), getOrderValue()) == 0 &&
                Objects.equals(getOrderDate(), order.getOrderDate()) &&
                Objects.equals(getUserLogin(), order.getUserLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderValue(), getOrderDate(), getUserLogin());
    }
}
