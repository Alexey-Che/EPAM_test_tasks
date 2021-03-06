package com.company.doandlearn.classes.classandobject.task9;

import java.util.*;

public class BookMain {
    public static void main(String[] args) {
        BookShop shop = new BookShop(new ArrayList<>());
        shop.addBook("Yiddish Policemen's Union", "Michael Chabon", "HarperCollins Canada",
                2008, 432, 22.78f, "hardcover");
        shop.addBook("Adventures and Misadventures of Maqroll", "Alvaro Mutis", "New York Review of Books",
                2002, 720, 20.12f, "paperback");
        shop.addBook("Long Ships", "Michael Chabon", "New York Review of Books",
                2010, 528, 16.16f, "paperback");
        shop.addBook("Fahrenheit 451", "Ray Bradbury", "Simon & Schuster",
                2012, 256, 14.20f, "paperback");
        shop.addBook("Amazing Adventures of Kavalier and Clay", "Michael Chabon", "Random House Publishing Group",
                2012, 704, 15.53f, "paperback");

        List<Book> authorsBook = shop.getAuthorsBooks("Ray Bradbury");
        for(Book book: authorsBook) {
            System.out.println(book);
        }

        List<Book> publishersBook = shop.getPublishersBook("HarperCollins Canada");
        for(Book book: publishersBook) {
            System.out.println(book);
        }

        System.out.println("books release after 2006:");
        List<Book> releaseAfter = shop.getReleaseAfter(2006);
        for(Book book: releaseAfter) {
            System.out.println(book);
        }

        List<String> list = Arrays.asList("abc","Tanya");
        Map<Integer, List<String>> myListTanya = new HashMap<>();
        myListTanya.put(1,list);

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"abc");
        myMap.put(1,"Tanya");

    }


}
