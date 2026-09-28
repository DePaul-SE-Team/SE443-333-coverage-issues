package org.example;

/**
 * Q3: What happens to coverage when you delete the code?
 * Step1: comment out code at line 13,14 and uncomment code at line 15
 */
public class Main_Issue3 {
    public double add(double x, double y){
        return x+y;
    }

    public double substract(double x, double y){
         double res = x+y;
         return res;
//        return x-y;
    }
}