# Task 4 — Does 100% coverage mean every edge case is covered?

**Files:** `src/main/java/org/example/Main_Issue4.java`,
`src/test/java/MainTest_Issue4.java`

## Learning objective

Line and branch coverage only tell you that a line or branch executed at
least once — not that every meaningful input, boundary, or edge case was
exercised.

## Steps

1. Run `MainTest_Issue4` with coverage. Confirm you're already at (or near)
   100% line and branch coverage for `isEven`, `flagChecker1`, and
   `flagChecker2`.
2. For `isEven(int x)`, list input categories the existing tests
   (`isEven(2)`, `isEven(3)`) do **not** try. Consider at least:
   - `0`
   - a negative even number
   - a negative odd number
   - `Integer.MAX_VALUE` / `Integer.MIN_VALUE`
3. Add new test assertions for at least two of those categories to
   `testIsEven()` (or a new test method). Run them.
4. Check the coverage report again after adding the new assertions.

## Reflection questions

1. Did adding the edge-case assertions in step 3 change the coverage
   percentage at all? Why might that surprise someone who equates "100%
   coverage" with "fully tested"?
2. `flagChecker1` (ternary) and `flagChecker2` (if/else) implement
   identical logic in different styles. Does testing one tell you anything
   about the correctness of the other? Why does branch coverage still
   count them as two separate things to cover?
3. In your own words, what is the difference between **coverage** and
   **test adequacy** (or correctness)?
4. Name one testing technique — other than raising the coverage number —
   that could systematically catch the gaps you found in step 2 (e.g.
   boundary value analysis, equivalence partitioning, mutation testing).
