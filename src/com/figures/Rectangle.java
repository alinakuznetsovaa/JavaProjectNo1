package com.figures;

import java.util.Objects;

import static java.lang.Double.*;
import static java.lang.Math.abs;

public class Rectangle {
    float length = 1.0f;
    float width = 1.0f;

    public Rectangle(){}

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    public float getLength(){ return this.length;}
    public void setLength(float length){ this.length = length;}
    public float getWidth(){
        return this.width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }
    public String toString(){
        return "Rectangle[length = "+ length+"; width = "+width+"]";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return (compare(rectangle.length, length) == 0) &&
                (compare(rectangle.width, width) == 0);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + (int)length;
        result = 31*result + (int)width;

        return result;
    }
}
