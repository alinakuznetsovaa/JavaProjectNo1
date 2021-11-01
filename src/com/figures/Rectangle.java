package com.figures;

import java.util.Objects;

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
    public boolean compareFloats(float first, float second){
        return abs(first - second) < 0.000001f;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return compareFloats(rectangle.length, length) &&
                compareFloats(rectangle.width, width);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + (int)length;
        result = 31*result + (int)width;

        return result;
    }
}
