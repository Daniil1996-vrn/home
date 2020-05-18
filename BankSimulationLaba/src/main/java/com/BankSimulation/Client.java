package com.BankSimulation;

public class Client {


    private String name;

    private boolean isMoneyTaker;

    private int sum;

    private int workTime;


    public Client(String name, boolean isMoneyTaker, int sum, int workTime) {
        this.name = name;
        this.isMoneyTaker = isMoneyTaker;
        this.sum = sum;
        this.workTime = workTime;
    }


    public String getName() {
        return name;
    }


    public boolean isMoneyTaker() {
        return isMoneyTaker;
    }


    public int getSum() {
        return sum;
    }


    public int getWorkTime() {
        return workTime;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", isMoneyTaker=" + isMoneyTaker +
                ", sum=" + sum +
                ", workTime=" + workTime +
                '}';
    }

}
