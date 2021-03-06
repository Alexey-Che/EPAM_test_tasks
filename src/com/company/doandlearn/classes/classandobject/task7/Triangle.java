package com.company.doandlearn.classes.classandobject.task7;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    private Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle createTriangle(Point a, Point b, Point c) {
        return isCorrectPoint(a, b, c) ? new Triangle(a, b, c) : null;
    }

    private static boolean isCorrectPoint(Point a, Point b, Point c) {
        if ((a.getX() - c.getX() * (b.getY() - c.getY() * (b.getX() - c.getX() * (a.getY() - c.getY())))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public double calcSideOfTriangle(Point a, Point b) {
        return Math.sqrt(Math.pow((a.getX()-b.getX()),2)+Math.pow((a.getY()-b.getY()),2));
    }

    public double calcPerimeterOfTriangle() {
        return calcSideOfTriangle(a,b)+calcSideOfTriangle(a,c)+calcSideOfTriangle(b,c);
    }

    public double calcAreaOfTriangle() {
        double p= calcPerimeterOfTriangle()/2;
        return Math.sqrt(p*(p-calcSideOfTriangle(a,b))*(p-calcSideOfTriangle(a,c))*(p-calcSideOfTriangle(b,c)));
    }

    public Point pointMedian() {
        double x =(a.getX()+b.getX()+c.getX())/3;
        double y =(a.getY()+b.getY()+c.getY())/3;
        return new Point(x,y);
    }
    /*private List<Book> books;
    public List<Book> getBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        if (author ==null) {
            return result;
        }
        for (Book book: books) {
            if (author.equals(book.getAuthor)) {
                result.add(book);
            }
        }
        return result;
    }*/
}
