package com.kodilla.bank.homework;

public class Bank {

    private String name;
    private CashMachine[] cashMachines = new CashMachine[2]; // tablica bankomatow

    public Bank(String name) {
        this.name = name; // nazwa bankomatu
        this.cashMachines[0] = new CashMachine(); // bankomat 1
        this.cashMachines[1] = new CashMachine();  // bankomat 2

    }

    public int getCashAmount() {
        int amount = 0; // calkowity bilans
        for(int i =0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getValues().length; j++) {
                amount = amount + cashMachine.getValues()[j];
            }
        }
        return amount;

    }

    public int getNumberOfWithdrawOperations() { // liczbę transakcji związanych z wypłatą,
        int withdrawNumber = 0;
        for(int i =0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getValues().length; j++) {
                if(cashMachine.getValues()[j]<0) {
                    withdrawNumber = withdrawNumber + 1;
                }
            }
        }
        return withdrawNumber;

    }

    public int getNumberOfDepositOperations() {
        int depositNumber = 0; // liczbę transakcji związaną z wpłatą pieniędzy,
        for(int i =0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getValues().length; j++) {
                if(cashMachine.getValues()[j]>0) {
                    depositNumber = depositNumber + 1;
                }
            }
        }
        return depositNumber;
    }

    public double getAverageAmountWithdrawOperations() { // średnią wartość wypłaty,
        double withdraw = 0;
        double withdrawNumber = 0;
        for(int i =0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getValues().length; j++) {
                if(cashMachine.getValues()[j]<0) {
                    withdraw = withdraw + cashMachine.getValues()[j];
                    withdrawNumber = withdrawNumber + 1;
                }
            }
        }
        return withdraw / withdrawNumber;

    }
    public double getAverageAmountDepositOperations() { // średnią wartość wpłaty.
        double deposit = 0;
        double depositeNumber = 0;
        for(int i =0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getValues().length; j++) {
                if(cashMachine.getValues()[j]>0) {
                    deposit = deposit + cashMachine.getValues()[j];
                    depositeNumber = depositeNumber + 1;
                }
            }
        }
        return deposit/ depositeNumber;

    }


     public void addDepositCashMachine(int operation, int cashMachineNumber) { // Transakcja wplaty
        if (operation > 0 && operation < 200) {
            this.cashMachines[cashMachineNumber].add(operation);
        }
    }

    public void addWithdrawCashMachine(int operation, int cashMachineNumber) { // Transakcja wyplaty
            if ( operation > -200 && operation < 0) {
            this.cashMachines[cashMachineNumber].add(operation);
        }
    }



}

