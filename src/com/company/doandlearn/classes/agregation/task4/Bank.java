package com.company.doandlearn.classes.agregation.task4;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public Client getClient(String firstName, String secondName) {
        for (Client client : clients) {
            if (client.getFirstName().equals(firstName) && client.getSecondName().equals(secondName)) {
                return client;
            }
        }
        return null;
    }

    public void addNewClient(Client client) {
        clients.add(client);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Bank %s has %d clients", name, clients.size());
    }
}
