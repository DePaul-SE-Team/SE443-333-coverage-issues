package org.example;

/**
 * Q1: What happens to code coverage when you delete the code? why?
 * Learning objective: coverage tells you which lines RAN, not whether the
 * output was correct. A test can reach 100% coverage and still hide a bug.
 *
 * Step 1: Run MainTest_Issue1 with coverage -> it passes at 100% coverage.
 * Step 2: Is there a bug despite the passing test and full coverage?
 *         If so, write another test case in MainTest_Issue1 that exposes it.
 * Step 3: Fix the bug (delete the offending line) and re-run with coverage.
 * Step 4: Compare the coverage percentage before and after the fix.
 *
 * See task1.md for guided questions.
 */
public class Main_Issue1 {
    public double add(double x, double y){
        x = x*2;
        return x+y;
    }
}