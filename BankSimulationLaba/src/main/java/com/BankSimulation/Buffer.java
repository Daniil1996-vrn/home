package com.BankSimulation;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Client> queue;


    public Buffer() {
        queue = new LinkedList();
    }


    public void addClient(Client client) {
        queue.add(client);
    }


    public Client getClient() {
        return queue.poll();
    }


    public boolean isEmpty() {
        return queue.size() == 0;
    }
}
