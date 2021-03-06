package com.company.doandlearn.classes.agregation.task4;

public class Account {

    private double balance;
    private long id;
    private boolean isOpen = true;

    public Account(double balance, long id) {
        this.balance = balance;
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void froze() {
        isOpen = false;
    }

    public void unFroze() {
        isOpen = true;
    }

    public String getStatus() {
        String status = isOpen ? "Unlocked" : "Blocked";
        return String.format("Account %d %s.", id, status);
    }
}
