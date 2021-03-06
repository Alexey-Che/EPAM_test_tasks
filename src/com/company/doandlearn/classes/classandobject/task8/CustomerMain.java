package com.company.doandlearn.classes.classandobject.task8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {

    public static void main(String[] args) {
        CustomerService clients = new CustomerService(new ArrayList<>());

        clients.addCustomer("Lesha", "Petrov","олегович",
                "Челябинкс", new BigInteger("1234789654125236"), 12345678);
        clients.addCustomer("Tereshchenko", "Anastasia", "Vladislavovna",
                "Minsk", new BigInteger("2222222222222222"), 23456789);
        clients.addCustomer("Solovei", "Yegor", "Vasilievich",
                "Moskou", new BigInteger("3333333333333333"), 34567891);
        clients.addCustomer("Kovalec", "Svetlana", "Konstantinovna",
                "Warsaw", new BigInteger("4444444444444444"), 45678912);
        clients.addCustomer("Saiko", "Dmitry", "Antonovich",
                "Kiev", new BigInteger("5555555555555555"), 56789123);

        System.out.println("Список покупателей в алфавитном порядке:");
        clients.sortByName();
        /*for (int i = 0; i < clients.getBase().size(); i++) {
            System.out.println(clients.getBase().get(i));
        }*/
        /*for (Customer client: clients.getBase()) {
            System.out.println(client);
        }*/

        clients.getBase().forEach(System.out::println);

        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
        List<Customer> list = clients.getCustomerByCreditCardRange("20000000", "5000000000");
        if (list == null || list.isEmpty()) {
            System.out.println("банковские карты не найдены");
        } else {
            for (Customer customer : list) {
                System.out.println(customer);
            }
        }


    }
}
