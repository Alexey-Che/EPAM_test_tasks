package com.company.doandlearn.classes.classandobject.task8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerService {
    private List<Customer> base;

    public CustomerService(List<Customer> base) {
        this.base = base;
    }

    public void addCustomer(String name, String surname, String patronymic, String address, BigInteger cardNumber, long accountNumber) {
        this.base.add(new Customer(name, surname, patronymic, address, cardNumber, accountNumber));
    }

    public List<Customer> getBase() {
        return base;
    }

    public void setBase(List<Customer> base) {
        this.base = base;
    }

    public void sortByName() {
        base.sort(Comparator.comparing(Customer::getSurname));
    }

    public List<Customer> getCustomerByCreditCardRange(String min, String max) {
        List<Customer> list = new ArrayList<>();
        for (Customer customer : this.base) {
            if (customer.getCardNumber().toString().compareTo(min) > 0
                    && customer.getCardNumber().toString().compareTo(max) < 0) {
                list.add(customer);
            }
        }
        return list;
    }
}
