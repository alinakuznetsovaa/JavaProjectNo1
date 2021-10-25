package com.polynomials;

import java.util.Arrays;

import static java.lang.Math.*;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double[] coeffs){
        this.coeffs = coeffs;

    }
    public boolean compareDoubles(double first, double second){
        if (abs(first-second)<0.000001d)
            return true;
        else return false;


    }

    public int getDegree(){
        return (coeffs.length-1) ;
    }

    public String toString(){

        int n=coeffs.length -1;

        String str="";


        while(n!=0) {

            if (compareDoubles(coeffs[n],0.0d)) {
                n-=1;
            } else if(coeffs[n]<0.0d) {
                str += coeffs[n] + " x^" + n + " ";
                n-=1;
            } else {
                str += " + " + coeffs[n] + " x^" + n+" ";
                n-=1;
            }


        };

        if(n==0) {
            if (compareDoubles(coeffs[n], 0.0d))
                return str;
            else str += " + " + coeffs[0];
        }
        return str;

    }

    public double evaluate(double x){
        int n=coeffs.length-1;
        double res = 0.0;
        while (n!=0) {

            res += coeffs[n] * pow(x,n);
            n-=1;
        };
        if(n==0)
            res+=coeffs[0];
        return res;
    }
    public MyPolynomial add(MyPolynomial polynomial){
        int n1=this.coeffs.length-1;
        int n2=polynomial.coeffs.length-1;

        if(n1>=n2)
        {
            double[] res=new double[n1+1];
            MyPolynomial poly = new MyPolynomial(res);
            for(int i=0;i<n1+1;i++)
                res[i]=this.coeffs[i]+polynomial.coeffs[i];
            return poly;

        } else {
            double[] res=new double[n2+1];
            MyPolynomial poly = new MyPolynomial(res);
            for(int i=0;i<n2+1;i++)
                res[i]=this.coeffs[i]+polynomial.coeffs[i];
            return poly;
        }

    }

    public MyPolynomial multiply(MyPolynomial polynomial){
        int n1=this.coeffs.length-1;
        int n2=polynomial.coeffs.length-1;
        double[] res=new double[n1+n2+1];
        MyPolynomial poly = new MyPolynomial(res);

        for(int i=0;i<n1+1;i++)
            for(int j=0;j<n2+1;j++)
            {
                res[i+j]+=this.coeffs[i] * polynomial.coeffs[j];

            }
        return poly;
    }
}