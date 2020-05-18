package com.BankSimulation;

public class Employee implements Runnable {


    private String name;

    private final BankStorage bankStorage;


    public Employee(String name, BankStorage bankStorage) {
        this.name = name;
        this.bankStorage = bankStorage;
    }


    public void run() {
        Client client = null;
        while (true) {
            synchronized (bankStorage.getQueue()) {
                if (!bankStorage.getQueue().isEmpty()) {
                    System.out.println(name + " взялся за работу");
                    client = bankStorage.getQueue().getClient();
                }
            }
            if (client != null) {
                try {
                    Thread.sleep(client.getWorkTime());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!client.isMoneyTaker()) {
                    bankStorage.setBankMoney(bankStorage.getBankMoney() + client.getSum());
                    System.out.println(client.getName() + " успешно положил " + client.getSum() + "$. " +
                            "Работал " + name);
                } else {
                    synchronized (bankStorage) {
                        if (bankStorage.getBankMoney() < client.getSum()) {
                            System.out.println(client.getName() + " не смог снять " + client.getSum() + "$. " +
                                    "Работал " + name);
                        } else {
                            bankStorage.setBankMoney(bankStorage.getBankMoney() - client.getSum());
                            System.out.println(client.getName() + " успешно снял " + client.getSum() + "$. " +
                                    "Работал " + name);
                        }
                    }
                }
                System.out.println("Состояние банка: " + bankStorage.getBankMoney() + "$");
                client = null;
            }
        }
    }

}
