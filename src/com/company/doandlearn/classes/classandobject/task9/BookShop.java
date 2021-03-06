package com.company.doandlearn.classes.classandobject.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BookShop {
    private List<Book> bookList;

    public BookShop(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(String title, String author, String publisher, int yearOfPublishing, int numberOfPages, float price, String bindingType) {
        this.bookList.add(new Book(title, author, publisher, yearOfPublishing, numberOfPages, price, bindingType));
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getAuthorsBooks(String author) {
        List<Book> authorList = new ArrayList<>();
        /*if (author==null) {
            return authorList;
        }*/
        for (Book book : this.bookList) {
            if (author != null && author.equalsIgnoreCase(book.getAuthor())) {
                authorList.add(book);
            }
        }
        return authorList;
    }

    /*public List<Book> getPublishersBook(String publisher) {
        List<Book> publisherList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                publisherList.add(book);
            }
        }
        return publisherList;
    }*/

    /*public List<Book> getReleaseAfter(int year) {
        List<Book> releaseAfterList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getYearOfPublishing() >= year) {
                releaseAfterList.add(book);
            }
        }
        return releaseAfterList;
    }*/

    public List<Book> getPublishersBook(String publisher) {
        return bookList.stream()
                .filter(Objects::nonNull)
                .filter(book -> book.getPublisher()!=null && book.getPublisher().equalsIgnoreCase(publisher))
                .collect(Collectors.toList());
    }

    public boolean anon (String publisher, Book book) {
        return book.getPublisher().equalsIgnoreCase(publisher);
    }

    public List<Book> getReleaseAfter(int year) {
        return bookList.stream()
                .filter(Objects::nonNull)
                .filter(book -> book.getYearOfPublishing()>=year)
                .collect(Collectors.toList());
    }
}
