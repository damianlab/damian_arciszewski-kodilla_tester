package com.kodilla.collections.adv.immutable.Exercise.Association;

public class Association {
    public static void main(String[] args) {
        Bank bank = new Bank("Axis");
        Employee employee = new Employee("Karol");
        System.out.println(employee.getEmployeeName() + " " + bank.getBankName());
    }
}
