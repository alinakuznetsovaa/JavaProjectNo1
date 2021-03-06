package com.complex;

import com.ball.Container;

import java.util.Objects;

import static java.lang.Double.*;
import static java.lang.Math.*;

public class MyComplex {
    private double real = 0.0d;
    private double image = 0.0d;

    public MyComplex(){ }

    public MyComplex(double real,double image){
        this.image=image;
        this.real=real;
    }
    public boolean compareDoubles(double first, double second){
        return abs(first - second) < 0.000001d;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real){
        this.real=real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public void setValue(double real,double image){
        this.real=real;
        this.image=image;
    }

    public String toString(){
        if(image<0.0d)
            return "("+real+image+"i)";
        else return "("+real+"+"+image+"i)";

    }

    public boolean isReal(){
        return !compareDoubles(real, 0.0d);
    }

    public boolean isImaginary(){
        return !compareDoubles(image, 0.0d);
    }

    public boolean equals(double real,double image){
        return (compare(this.real, real) == 0)&&
                (compare(this.image, image) == 0);
    }


    public boolean equals(MyComplex complex){
        return (compare(this.real, complex.real) == 0 )&&
                (compare(this.image, complex.image) == 0);
    }


    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + (int)real;
        result = 31*result + (int)image;

        return result;
    }

    public double magnitude(){
        return sqrt(pow(real,2) + pow(image,2));
    }

    public double argument(){
        double a=(double)image/real;
        if(real<0.0d && image>0.0d)
            return PI+atan(a);
        if(real<0.0d && image<0.0d)
            return atan(a)-PI;
        return atan(a);
    }

    public MyComplex add(MyComplex complex){
        this.real +=complex.real;
        this.image+=complex.image;
        return this;
    }

    public MyComplex subtract(MyComplex complex){
        this.real -=complex.real;
        this.image-=complex.image;
        return this;
    }

    public MyComplex multiply(MyComplex complex){
        MyComplex tmp = new MyComplex();
        tmp.real = this.real * complex.real - this.image * complex.image;
        tmp.image=this.real * complex.image + complex.real * this.image;
        this.real = tmp.real;
        this.image=tmp.image;
        return this;
    }

    public MyComplex divide(MyComplex complex){
        MyComplex tmp = new MyComplex();
        tmp.real = (this.real * complex.real + this.image * complex.image)/(pow(complex.real,2) + pow(complex.image,2));
        tmp.image=(complex.real * this.image - this.real * complex.image)/(pow(complex.real,2) + pow(complex.image,2));
        this.real = tmp.real;
        this.image=tmp.image;
        return this;
    }


    public MyComplex addNew(MyComplex complex){
        MyComplex newComplex=new MyComplex();
        newComplex.real = this.real +complex.real;
        newComplex.image = this.image+complex.image;
        return newComplex;
    }

    public MyComplex subtractNew(MyComplex complex){
        MyComplex newComplex=new MyComplex();
        newComplex.real = this.real - complex.real;
        newComplex.image = this.image - complex.image;
        return newComplex;
    }

    public MyComplex conjugate(){
        MyComplex newComplex=new MyComplex();
        newComplex.real=this.real;
        newComplex.image=-this.image;
        return newComplex;
    }

}
