package com.books;

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

    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
        return authors.clone();
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

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
}
