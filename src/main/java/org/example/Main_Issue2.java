package org.example;

/**
 * Q2: What happens to code coverage when you add new code?
 * Learning objective: newly added code that no test exercises does not
 * raise coverage on its own — it shows up as uncovered until a test calls it.
 *
 * Step 1: Run MainTest_Issue2 with coverage and check the coverage shown
 *         for substract() before making any change. Is it called by any
 *         existing test?
 * Step 2: Uncomment line 13 below to simulate a developer adding a new
 *         line of logic, and re-run with coverage (without adding a test).
 * Step 3: Write a new test that actually calls substract() and observe
 *         how coverage changes only once a test exercises the new code.
 *
 * See task2.md for guided questions.
 */
public class Main_Issue2 {
    public double add(double x, double y){
        return x+y;
    }

    public double substract(double x, double y){
//         double res = x+y;
        return x-y;
    }
}