package com.figures;
import com.employees.Employee;

import static java.lang.Double.*;
import static java.lang.Math.*;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(){}

    public Circle(double radius){ this.radius = radius; }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;

    }

    public double getRadius(){ return this.radius; }

    public String getColor(){ return this.color; }

    public void setRadius(double radius){ this.radius = radius; }

    public void setColor(String color){ this.color = color; }

    public String toString(){
        return "Circle[radius = "+radius+"; color = "+color+"]";
    }

    public double getArea(){ return (PI * pow(radius,2));}

    public boolean compareDoubles(double first, double second){
        return abs(first - second) < 0.000001d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return (compare(radius,circle.radius) == 0) && color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + (int)radius;
        result = 31*result + color.hashCode();

        return result;

    }
}

