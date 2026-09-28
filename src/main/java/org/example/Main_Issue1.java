package org.example;

/**
 * Q1: What happens to code coverage when you delete the code? why?
 * Step 1: run the test -> passes
 * Step 2: is there a bug? even if test passes? If there is a bug, write another test case to expose it
 * Step 4: fix the bug (delete)
 */
public class Main_Issue1 {
    public double add(double x, double y){
        x = x*2;
        return x+y;
    }
}