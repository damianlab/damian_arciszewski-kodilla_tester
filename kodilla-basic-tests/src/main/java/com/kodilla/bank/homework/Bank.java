package com.kodilla.bank.homework;

public class Bank {

    private String name;
    private CashMachine deposit;
    private CashMachine withdraw;


    public Bank(String name) {
        this.name = name; // nazwa bankomatu
        this.deposit = new CashMachine();
        this.withdraw = new CashMachine(); // nazwa z klasy CashMachine

    }

     public void addDepositCashMachine(int operation) { // wplata kwoty do 200 jednostek
        if (operation > 0 && operation < 200) {
            this.deposit.add(operation);
        }
    }

    public void addWithdrawCashMachine(int operation) { // wyplata do 200 jednostek
        double cashAmount =0;
        if ( operation > -200 && operation < 0) {
            this.withdraw.add(operation);
        }
    }

    public double getDepositAmount() { // suma wplat
        return this.deposit.getCashAmount();
    }

    public int[] getDepositNumberOfOperations() {
        return this.deposit.getValues();}

    public double getWithdrawAmount() {
        return this.withdraw.getCashAmount();
    }
    public int[] getWithdrawNumberOfOperations() {
        return this.withdraw.getValues();}

    public double getCashAmount() { // Calkowaia kwota przeprowadzonych tranzakcji

        double cashAmount = this.deposit.getCashAmount() + this.withdraw.getCashAmount();
        return cashAmount;

    }

    public double getDepositAvarage() {
        double cashDepositAvarage = this.deposit.getAvarage();
        return cashDepositAvarage;
    }
        public double getWithrawAvarage() {
            double cashWithdrawAvarage = this.withdraw.getAvarage();
            return cashWithdrawAvarage;

    }

}

