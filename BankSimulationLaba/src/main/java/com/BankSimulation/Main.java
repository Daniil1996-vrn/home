package com.BankSimulation;

public class Main {

    public static void main(String[] args) {
        BankStorage bankStorage = new BankStorage(0);
        Thread bankThread = new Thread(bankStorage);
        bankThread.start();
    }

}
