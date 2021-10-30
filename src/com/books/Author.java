package com.books;

public class Author {
    private String name;
    private String email;
    private char gender;

public Author(){}
public Author(String name,String email,char gender){
    this.name=name;
    this.email=email;
    this.gender=gender;

}

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}
