package com.company.doandlearn.classes.agregation.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client {

    private String firstName;
    private String secondName;
    private List<Account> accounts;

    public Client(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getBalance() {
        double balance = 0;
        for (Account account : accounts) {
            balance += account.getBalance();
        }
        return String.format("%.2f $", balance);
    }

    public String getPositiveAccounts() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() > 0) {
                balance += account.getBalance();
            }
        }
        return String.format("%.2f $", balance);
    }

    public String getNegativeAccounts() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() < 0) {
                balance += account.getBalance();
            }
        }
        return String.format("%.2f $", balance);
    }

    public void sortByBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public List<Account> sortReverse() {
        return this.accounts = accounts.stream()
                .sorted(Comparator.comparing(Account::getBalance).reversed())
                .collect(Collectors.toList());
    }

    public Account getAccount(long id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void blockAccount(long id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.froze();
            }
        }
    }

    public void unlockAccount(long id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.unFroze();
            }
        }
    }

    public String getInformation() {
        StringBuilder information = new StringBuilder();
        for (Account account : accounts) {
            information.append(String.format("#%d, balance: %.2f $, status: %s\n", account.getId(), account.getBalance(), account.getStatus()));
        }
        return String.format("Client %s has accounts:\n%s", toString(), information.toString());
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, secondName);
    }
}
