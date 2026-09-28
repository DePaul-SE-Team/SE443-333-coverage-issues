# Task 3 — What happens to coverage when you fix untested code?

**Files:** `src/main/java/org/example/Main_Issue3.java`,
`src/test/java/MainTest_Issue3.java`

## Learning objective

If a method was never covered to begin with, changing its logic — fixing a
bug or introducing one — doesn't move the coverage number at all. Coverage
can't tell a reviewer that a bug was fixed, or that a new one was
introduced, in code no test touches.

## Steps

1. Run `MainTest_Issue3` with coverage. Check the coverage shown for
   `substract()`. Is it exercised by `test1` or `test2`?
2. Read `substract()`'s body closely:
   ```java
   public double substract(double x, double y){
        double res = x+y;
        return res;
   //        return x-y;
   }
   ```
   Does this method actually implement subtraction? What would
   `substract(5.0, 2.0)` currently return?
3. Comment out lines 13-14 and uncomment line 15, so `substract` returns
   `x - y` directly, matching what its name promises.
4. Re-run the existing tests with coverage. Compare `substract()`'s
   coverage percentage before (step 1) and after (step 4) your fix.

## Reflection questions

1. Did fixing the logic bug in `substract()` change its coverage
   percentage? Why or why not?
2. If coverage didn't change, how would a teammate reviewing only a
   coverage report — not the diff itself — know that you changed the
   behavior of `substract()`, for better or worse?
3. Write the test that should have existed for `substract()` from the
   start. What assertion would have failed *before* your fix and passed
   *after* it?
4. Compare this exercise to Task 2: in Task 2, coverage stayed flat when
   code was added without a test; here, coverage stayed flat when code was
   *changed* without a test. What's the common root cause in both cases?
