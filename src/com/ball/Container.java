package com.ball;

import java.util.concurrent.Callable;

import static java.lang.Math.abs;

public class Container {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Container(int x,int y,int width,int height){
        x1=x;
        y1=y;
        x2=x1+width;
        y2=y1-height;

    }

    public int getX1() { return x1; }

    public int getX2() { return x2; }

    public int getY1() { return y1; }

    public int getY2() { return y2; }

    public int getWidth(){
        return x2-x1;
    }
    public int getHeight(){
        return y1-y2;
    }

    public boolean collides(Ball ball){
        return ball.getRadius() + ball.getX() < x2 && ball.getRadius() + ball.getY() < y1 && ball.getX() - ball.getRadius() > x1 && ball.getY() - ball.getRadius() > y2;
    }

    public boolean compareDoubles(double first, double second){
        return abs(first - second) < 0.000001d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container)) return false;
        Container container = (Container) o;
        return x1==container.x1 &&
                x2==container.x2 &&
                y1==container.y1 &&
                y2==container.y2;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + x1;
        result = 31*result + x2;
        result = 31*result + y1;
        result = 31*result + y2;


        return result;
    }
}
