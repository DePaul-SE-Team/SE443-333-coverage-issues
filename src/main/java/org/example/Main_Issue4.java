package org.example;

/**
 * Q4: Does 100% coverage mean all edge cases have been covered?
 * Learning objective: line/branch coverage only tells you that a line or
 * branch executed at least once — not that every meaningful input was tried.
 *
 * Step 1: Run MainTest_Issue4 with coverage and confirm you're already at
 *         (or near) 100% line and branch coverage.
 * Step 2: List input categories isEven(), flagChecker1(), and flagChecker2()
 *         could receive that the existing tests don't try (e.g. 0, negative
 *         numbers, extreme values).
 * Step 3: Add tests for a couple of those categories and see whether
 *         coverage changes at all.
 *
 * See task4.md for guided questions.
 */
public class Main_Issue4 {
    public boolean isEven(int x) {
        return (x % 2 == 0);
    }
    public boolean flagChecker1(boolean flag) {
        return flag ? true : false;
    }
    public boolean flagChecker2(boolean flag) {
        if (flag){
            return true;
        }
        else {
            return false;
        }
    }
}