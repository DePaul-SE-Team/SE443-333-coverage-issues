# Task 1 — Does coverage mean the code is correct?

**Files:** `src/main/java/org/example/Main_Issue1.java`,
`src/test/java/MainTest_Issue1.java`

## Learning objective

Coverage tells you which lines *ran*, not whether the result they produced
was *correct*. A test suite can reach 100% coverage and still let a bug
through.

## Steps

1. Run `MainTest_Issue1` with coverage. Note the coverage percentage for
   `Main_Issue1.add`.
2. Read `add`'s implementation carefully, line by line.
3. Look at `test1`: it calls `main.add(0.0, 2.0)` and expects `2.0`. Trace
   through `add` by hand with those inputs. Does the test pass? Does it
   *look* correct even though it passes?
4. In `MainTest_Issue1.java`, complete the `//TODO`: add a new test method
   that calls `add` with a **non-zero** first argument (for example
   `add(3.0, 2.0)`) and asserts the mathematically correct sum. Run it.
5. Once you understand why the new test fails, open `Main_Issue1.java` and
   fix the bug (delete the offending line).
6. Re-run both tests with coverage. Note the new coverage percentage.

## Reflection questions

Answer these in your own words (a sentence or two each is fine).

1. Why did `test1` pass even though `add` has a bug?
2. What specific input value made the bug invisible to `test1`?
3. After you deleted the buggy line, did line coverage go up, go down, or
   stay the same? Why?
4. Based on this exercise, is "100% coverage" ever sufficient evidence on
   its own that a method is correct? What else would you want to see?
5. What test-design practice would have caught this bug before it shipped?
