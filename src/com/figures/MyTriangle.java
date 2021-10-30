package com.figures;
import static java.lang.Math.*;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(int x1,int y1,int x2,int y2,int x3, int y3){
        v1=new MyPoint(x1,y1);
        v2=new MyPoint(x2,y2);
        v3=new MyPoint(x3,y3);
    }

    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }

    public String toString(){
        return "MyTriangle[v1=("+ v1.getX()+","+v1.getY()+"), "+"v2=("+ v2.getX()+","+v2.getY()+"), "+"v3=("+v3.getX()+","+v3.getY()+")]";
    }

    public double getPerimeter(){
       return  (v1.distance(v2) + v2.distance(v3) + v3.distance(v1));

    }
    public boolean compareDoubles(double first, double second){
        return abs(first - second) < 0.000001d;
    }

    public String getType(){
        double a=v1.distance(v2);
        double b=v2.distance(v3);
        double c=v3.distance(v1);

        if( a+b<c || a+c<b || b+c<a)
            return "non-existent triangle type";
        if(compareDoubles(a,b) && compareDoubles(b,c))
            return "equilateral triangle";
        if(compareDoubles(a,b) || compareDoubles(b,c) || compareDoubles(c,a))
            return "isosceles triangle";
        return "an ordinary triangle";
    }
}
