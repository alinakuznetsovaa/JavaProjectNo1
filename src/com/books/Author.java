package com.books;

import com.ball.Container;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return gender == author.gender &&
                name.equals(author.name) &&
                email.equals(author.email);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + (int)gender;
        result = 31*result + name.hashCode();
        result = 31*result + email.hashCode();

        return result;
    }
}
