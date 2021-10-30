package com.ball;

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
}
