package com.company;//пакет, который содержит классы


import com.ball.Ball;
import com.ball.Container;
import com.complex.MyComplex;
import com.figures.*;
import com.books.Author;
import com.books.Book;
import com.employees.Employee;
import com.polynomials.MyPolynomial;
import java.util.Scanner;
import java.util.Arrays;

public class Main { //класс, доступен для других пакетов (т к паблик)



    public static void main(String[] args) {
        //start tests for class Circle

        /*Circle circle = new Circle(5,"red");
        Circle circle1 = new Circle();
        circle1.setRadius(3);
        circle1.setColor("yellow");
        System.out.println(circle1.toString());
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
        System.out.println(circle.toString());*/

        // end tests for class Circle

        //start tests for class Rectangle

       /*Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(5,3);
        rectangle.setLength(6);
        rectangle.setWidth(4);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());*/

        // end tests for class Rectangle


        //start tests for class Employee

        /*Employee employee = new Employee(2,"Alina","Kuznetsova",50000);
        employee.setSalary(55000);
        System.out.println( employee.raiseSalary(-10));
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.getName());
        System.out.println(employee.getID());
        System.out.println(employee.toString());*/

        // end tests for class Employee

        //start tests for class Book

        /*Author author1=new Author("a","b",'c');
        Author author2=new Author("a","b",'c');
        Author author3=new Author("a","b",'c');
        Author[]authors={author1,author2,author3};
        Book book = new Book("Boo",authors,200.0,3);
        System.out.println(book.getName());
        System.out.println(Arrays.toString(book.getAuthors()));
        System.out.println(book.getPrise());
        System.out.println(book.getQty());
        System.out.println(book.toString());
        System.out.println(book.getAuthorNames());*/

        // end tests for class Book

        //start tests for class MyPoint

        /*MyPoint point=new MyPoint(3,4);
        MyPoint point1=new MyPoint(3,4);

        point.setXY(5,6);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point.toString());
        System.out.println(point.distance(8,9));
        System.out.println(point.distance(point1));
        System.out.println(point.distance());*/

        // end tests for class MyPoint

        //start tests for class MyTriangle

        /*MyPoint point1=new MyPoint(1,6);
        MyPoint point2=new MyPoint(4,2);
        MyPoint point3=new MyPoint(7,6);
        //MyTriangle triangle = new MyTriangle(point1,point2,point3);
        MyTriangle triangle1 = new MyTriangle(1,6,0,2,7,0);
        System.out.println(triangle1);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getType());*/

        // end tests for class MyTriangle

        //start tests for class MyComplex

        /*MyComplex complex=new MyComplex(1.0,2.0);
        MyComplex complex1=new MyComplex(2.0,2.0);

        System.out.println(complex.getReal());
        complex.setReal(3.0);
        System.out.println(complex);
        System.out.println(complex.isReal());

        System.out.println(complex.equals(complex1));
        System.out.println(complex.equals(1.0,2.0));

        System.out.println(complex.magnitude());
        System.out.println(complex.argument());

        System.out.println(complex.addNew(complex1));
        System.out.println(complex.add(complex1));
        System.out.println(complex.subtractNew(complex1));
        System.out.println(complex.subtract(complex1));

        System.out.println(complex.multiply(complex1));
        System.out.println(complex.divide(complex1));
        System.out.println(complex.conjugate());*/


        // end tests for class MyComplex


        // start tests for class MyPolynom
       /*double[]coefs=new double[]{0.0,-3.0,-2.0,3.0,0.0};
       MyPolynomial polynomial=new MyPolynomial(coefs);
       System.out.println(polynomial.evaluate(3.0d));
       double[]coefs1=new double[]{1.0,2.0,3.0,4.0,0.0};
       MyPolynomial polynomial1=new MyPolynomial(coefs1);
       System.out.println(polynomial.getDegree());
       System.out.println(polynomial);
       System.out.println(polynomial.add(polynomial1));
       System.out.println(polynomial.multiply(polynomial1));*/


        // end tests for class MyPolynom


        // start tests for class Ball

        /*Ball ball=new Ball(3.0f,4.0f,5,5,180);
        System.out.println(ball);
        Container container = new Container(1,6,6,4);
        System.out.println(container.collidesWidth(ball));
        System.out.println(ball.getXDelta());
        System.out.println(ball.getYDelta());
        System.out.println(ball);
        ball.move();
        System.out.println(ball);*/

        // end tests for class Ball


        // start tests for class Container
        /*Container container = new Container(-50,50,100,50);
        Ball ball = new Ball(0,30,10,15,90 );
        System.out.println(ball);
        int count=0;
        while(count<5){
            ball.move();
            if(ball.getX() + ball.getRadius() > container.getX2() || ball.getX() - ball.getRadius() < container.getX1()) {
                ball.reflectHorizontal();
                ball.move();
                count++;
            }

            if(ball.getY() + ball.getRadius() > container.getY1() || ball.getY() - ball.getRadius() < container.getY2()){
                ball.reflectVertical();
                ball.move();
                count++;
            }

        }
        System.out.println(ball);
        System.out.println(ball);
        while(container.collides(ball)){
            ball.move();
            System.out.println(ball);
        } */



        // end tests for class Container



















    }
}