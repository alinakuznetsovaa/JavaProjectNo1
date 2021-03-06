package com.figures;
import java.util.Objects;

import static java.lang.Math.*;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){}

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] arr = {x,y};
        return arr;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }


    public String toString(){
        return "("+x+","+y+")";
    }

    public double distance(int x, int y){
       return sqrt(pow((this.x-x),2) + pow((this.y-y),2));
    }

    public double distance(MyPoint point){
        return sqrt(pow((this.x-point.x),2) + pow((this.y-point.y),2));
    }

    public double distance(){
        return sqrt(pow(this.x,2) + pow(this.y,2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPoint)) return false;
        MyPoint myPoint = (MyPoint) o;
        return x == myPoint.x &&
                y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + x;
        result = 31*result + y;

        return result;
    }
}
