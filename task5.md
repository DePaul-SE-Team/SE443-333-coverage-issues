# Task 5 — Can you get 100% coverage without any assertions?

**Files:** `src/main/java/org/example/Main_Issue5.java`,
`src/test/java/MainTest_Issue5.java`

## Learning objective

Coverage tools measure whether code *ran*, not whether its result was
*checked*. A test suite can hit 100% line and branch coverage while
asserting nothing — and would pass even if the underlying code were
completely broken.

## Steps

1. Run `MainTest_Issue5` with coverage. Note the coverage percentage for
   `isEven`, `flagChecker1`, and `flagChecker2`.
2. Open `MainTest_Issue5.java` and look closely at each test method. Do any
   of them contain an `assert*()` call (`assertTrue`, `assertEquals`,
   etc.)?
3. Deliberately break the logic in `Main_Issue5.java` — for example, swap
   the return values in `flagChecker2` so it returns `false` for `true` and
   vice versa. Re-run `MainTest_Issue5` (unchanged). Do the tests still
   report as passing? What does the coverage report show?
4. Undo your deliberate bug. Now add real assertions to
   `MainTest_Issue5.java` (compare against `MainTest_Issue4.java` for a
   model of what that looks like) so each test actually checks the
   returned value.
5. Re-introduce the same deliberate bug from step 3 and re-run your
   updated, asserting tests. Do they now fail as expected?

## Reflection questions

1. Was it possible to reach 100% line and branch coverage with zero
   assertions? What does that prove about coverage as a metric?
2. After you added assertions in step 4, did the *coverage percentage*
   itself change at all? Why or why not?
3. Why is "all tests are green and coverage is 100%" not, by itself,
   sufficient evidence that a piece of code is correct?
4. Write one sentence you could say in a code review to a teammate who
   argues "don't worry about testing this more, we already have 100%
   coverage" — referring to tests shaped like the *original*
   `MainTest_Issue5.java`.
