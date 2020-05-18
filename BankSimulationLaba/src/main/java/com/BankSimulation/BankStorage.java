package com.BankSimulation;

import java.util.Random;

public class BankStorage implements Runnable {

    private int bankMoney;

    private Buffer queue;

    private Random random;


    public BankStorage(int bankMoney) {
        this.bankMoney = bankMoney;
    }


    public int getBankMoney() {
        return bankMoney;
    }


    public void setBankMoney(int bankMoney) {
        this.bankMoney = bankMoney;
    }


    public Buffer getQueue() {
        return queue;
    }


    public void run() {
        queue = new Buffer();
        random = new Random();
        Employee employee1 = new Employee("Employee №1", this);
        Employee employee2 = new Employee("Employee №2", this);
        Employee employee3 = new Employee("Employee №3", this);
        Employee employee4 = new Employee("Employee №4", this);
        Employee employee5 = new Employee("Employee №5", this);

        Thread thread1 = new Thread(employee1);
        thread1.start();
        Thread thread2 = new Thread(employee2);
        thread2.start();
        Thread thread3 = new Thread(employee3);
        thread3.start();
        Thread thread4 = new Thread(employee4);
        thread4.start();
        Thread thread5 = new Thread(employee5);
        thread5.start();

        int i = 1;
        Client client;
        while (true) {
            try {
                Thread.sleep( 2000);
                String clientName = "Client №" + i;
                client = new Client(clientName, random.nextBoolean(), random.nextInt(200), random.nextInt(4000));
                queue.addClient(client);
                System.out.println("Появился новый клиент: " + client);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

}
