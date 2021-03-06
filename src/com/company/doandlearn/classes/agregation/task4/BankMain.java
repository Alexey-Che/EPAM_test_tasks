package com.company.doandlearn.classes.agregation.task4;

public class BankMain {

    public static void main(String[] args) {

        Bank bank = new Bank("VasyaBank");

        Client ivanov = new Client("Ivanov", "Petrov");
        Client petrov = new Client("Petrov", "Sidorov");

        bank.addNewClient(ivanov);
        bank.addNewClient(petrov);

        ivanov.openAccount(new Account(324.54, 34569876));
        ivanov.openAccount(new Account(-324.54, 65569876));
        ivanov.openAccount(new Account(4324.54, 86549876));
        ivanov.openAccount(new Account(-7324.54, 34745476));
        ivanov.openAccount(new Account(6324.54, 84569876));

        petrov.openAccount(new Account(4857.65, 23458688));
        petrov.openAccount(new Account(-4857.32, 14248688));
        petrov.openAccount(new Account(4357.02, 57562344));
        petrov.openAccount(new Account(48.65, 53456388));
        petrov.openAccount(new Account(-47.12, 23478988));
        petrov.openAccount(new Account(57.43, 53451288));

        System.out.println(bank.getClient("Ivanov", "Petrov").getAccount(65569876).getStatus());
        bank.getClient("Ivanov", "Petrov").blockAccount(65569876);
        System.out.println(bank.getClient("Ivanov", "Petrov").getAccount(65569876).getStatus());

        System.out.println(ivanov.getInformation());
        ivanov.sortByBalance();
        System.out.println(ivanov.getInformation());
        ivanov.sortReverse();
        System.out.println(ivanov.getInformation());
        System.out.println(ivanov.getBalance());
        System.out.println(ivanov.toString()+ ", positive balance: "+ ivanov.getPositiveAccounts());
        System.out.println(ivanov.getNegativeAccounts());
        ivanov.unlockAccount(65569876);
        System.out.println(ivanov.getInformation());
        System.out.println(bank);
    }
}
