package com.ball;

import java.util.Objects;

import static java.lang.Math.*;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x,float y,int radius,int speed, int direction){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta = (float)(speed * cos(direction));
        this.yDelta = (float)((-speed) * sin(direction));
    }

    public float getX() { return x; }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta=-xDelta;
    }

    public void reflectVertical(){
        yDelta=-yDelta;
    }

    public String toString(){
        return "Ball [ ( " + x + "," + y + "), speed = (" + xDelta + "," + yDelta + ") ]";
    }
    public boolean compareDoubles(double first, double second){
        return abs(first - second) < 0.000001d;
    }

    public boolean compareFloats(float first, float second){
        return abs(first - second) < 0.000001f;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return compareDoubles(x,ball.x) &&
                compareDoubles(y,ball.y) &&
                radius==ball.radius &&
                compareFloats(xDelta, ball.xDelta) &&
                compareFloats(yDelta, ball.yDelta);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + (int)x;
        result = 31*result + (int)y;
        result = 31*result + radius;
        result = 31*result + (int)xDelta;
        result = 31*result + (int)yDelta;

        return result;
    }
}
