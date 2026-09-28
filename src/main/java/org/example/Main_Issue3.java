package org.example;

/**
 * Q3: What happens to coverage when you delete/modify code that has no test?
 * Learning objective: if a method was never covered to begin with, fixing
 * (or breaking) its logic doesn't move the coverage number at all — coverage
 * can't tell a reviewer that a bug was fixed, or that one was introduced.
 *
 * Step 1: Run MainTest_Issue3 with coverage and check the coverage shown
 *         for substract() first. Is it exercised by any existing test?
 *         Read substract()'s body — does it actually implement subtraction?
 * Step 2: Comment out the code at lines 13-14 and uncomment code at line 15
 *         to fix the bug, then re-run with coverage.
 * Step 3: Compare the coverage percentage for substract() before and after
 *         your fix.
 *
 * See task3.md for guided questions.
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