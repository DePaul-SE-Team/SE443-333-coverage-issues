package org.example;

/**
 * Q5: Can you get 100% coverage without any assertions?
 * Learning objective: coverage tools measure whether code RAN, not whether
 * its result was checked. A test suite can hit 100% coverage while
 * asserting nothing at all, and would pass even if the code were broken.
 *
 * Step 1: Run MainTest_Issue5 with coverage and check what percentage you
 *         get for isEven(), flagChecker1(), and flagChecker2().
 * Step 2: Look at MainTest_Issue5.java — do any of the tests contain an
 *         assert*() call?
 * Step 3: Deliberately break the logic in one of the methods below (e.g.
 *         swap the return values in flagChecker2) and re-run the existing
 *         tests. Do they still pass?
 * Step 4: Add real assertions to the tests and repeat step 3 — do they now
 *         catch the deliberate bug?
 *
 * See task5.md for guided questions.
 */
public class Main_Issue5 {
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