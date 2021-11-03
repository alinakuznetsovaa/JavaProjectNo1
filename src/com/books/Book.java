package com.books;

import com.ball.Container;

import java.util.Arrays;
import java.util.Objects;

import static java.lang.Double.*;
import static java.lang.Math.abs;

public class Book {
    private String name;
    private Author[] authors;
    private double prise;
    private int qty = 0;

    public Book(String name, Author[] authors,double prise){
        this.name = name;
        this.prise = prise;
        this.authors = authors;
    }

    public Book(String name, Author[] authors,double prise, int qty){
        this.name = name;
        this.prise = prise;
        this.authors = authors;
        this.qty = qty;
    }

    public String getName(){ return name; }

    public Author[] getAuthors(){ return authors.clone(); }

    public double getPrise() { return prise; }

    public void setPrise(double prise) { this.prise = prise; }

    public int getQty() { return qty; }

    public void setQty(int qty) { this.qty = qty; }

    public String toString(){
        String[] str = new String[authors.length];
        String s = "";
        for(int i = 0; i < authors.length; i++) {
            str[i] = "Author " + i + " [name = " + authors[i].getName() + ",email = " + authors[i].getEmail() + ",gender = " + authors[i].getGender() + "]  ";
            s+=str[i];
        }
        return "Book[name = "+ name +", authors = ("+ s +"), price = " + prise +", qty = "+ qty +"]";
    }

    public String getAuthorNames(){
        String[] str = new String[authors.length];
        String s = "";
        for(int i = 0; i<authors.length; i++) {
            str[i] =  authors[i].getName() + " ";
            s+=str[i];
        }
        return s;
    }
    public boolean compareDoubles(double first, double second){
        return abs(first - second) < 0.000001d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return (compare(prise, book.prise) == 0) &&
                qty == book.qty &&
                name.equals(book.name) &&
                Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + qty;
        result = 31*result + (int)prise;
        result = 31*result + name.hashCode();
        result = 31*result + Arrays.hashCode(authors);


        return result;
    }
}
