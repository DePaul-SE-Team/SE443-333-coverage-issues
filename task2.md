# Task 2 — What happens to coverage when you add new code?

**Files:** `src/main/java/org/example/Main_Issue2.java`,
`src/test/java/MainTest_Issue2.java`

## Learning objective

Coverage only credits code that a test actually exercises. Adding new code
does not raise coverage by itself — new code starts out **uncovered** until
a test calls it.

## Steps

1. Run `MainTest_Issue2` with coverage before making any change. Look at
   the coverage shown for `substract()` specifically. Is it called by
   either `test1` or `test2`?
2. In `Main_Issue2.java`, uncomment line 13 (`double res = x+y;`) to
   simulate a developer adding a new line of logic, **without** writing any
   new test yet.
3. Re-run the existing tests with coverage. Look at `substract()` again.
4. Now add a new test method (e.g. `test3`) to `MainTest_Issue2.java` that
   actually calls `substract()` and asserts on its result. Run it.
5. Re-run with coverage one more time and compare `substract()`'s coverage
   across all three checkpoints (steps 1, 3, and 4).

## Reflection questions

1. Before you added `test3`, was `substract()` counted as covered at all?
   What did the coverage tool show for it, and what does that number mean?
2. Did uncommenting line 13 in step 2 change the coverage percentage on its
   own? Why or why not?
3. If a teammate opened a pull request that added a whole new method but no
   new test, and your CI only reports an aggregate "project coverage %",
   how easily would that gap be noticed? What would make it easier to spot?
4. Propose one concrete practice (e.g. diff coverage checks in CI, a rule
   that new code needs a test in the same PR) that would have caught this
   automatically.
