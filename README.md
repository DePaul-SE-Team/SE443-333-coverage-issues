# SE443/333 – Code Coverage Issues Lab

This lab walks through five short exercises that show how code coverage
metrics can be misleading. Each exercise pairs a small class
(`src/main/java/org/example/Main_IssueN.java`) with a test class
(`src/test/java/MainTest_IssueN.java`) and asks a specific question about
what happens to coverage when the code changes.

| # | File(s) | Question | Guided task |
|---|---------|----------|-------------|
| 1 | `Main_Issue1` / `MainTest_Issue1` | What happens to code coverage when you delete code — and does a passing test with full coverage mean the code is correct? | [task1.md](task1.md) |
| 2 | `Main_Issue2` / `MainTest_Issue2` | What happens to coverage when you add new code? | [task2.md](task2.md) |
| 3 | `Main_Issue3` / `MainTest_Issue3` | What happens to coverage when you delete/modify code that has no tests? | [task3.md](task3.md) |
| 4 | `Main_Issue4` / `MainTest_Issue4` | Does 100% coverage mean every edge case has been covered? | [task4.md](task4.md) |
| 5 | `Main_Issue5` / `MainTest_Issue5` | Can you reach 100% coverage without any assertions? | [task5.md](task5.md) |

## Prerequisites

- JDK 25
- Maven (`mvn` on your PATH)
- An IDE with a coverage runner (IntelliJ IDEA's "Run with Coverage" is
  assumed below). This project does not configure a Maven coverage plugin
  (e.g. JaCoCo), so coverage is measured through the IDE, not through
  `mvn test`.

## Running the tests

```
mvn test                                    # run every test class
mvn test -Dtest=MainTest_Issue3             # run one issue's test class
mvn test -Dtest=MainTest_Issue3#test1       # run a single test method
```

## Measuring coverage (IntelliJ)

1. Right-click the test class you want to run (e.g. `MainTest_Issue1`).
2. Choose **More Run/Debug** → **Run 'MainTest_IssueN' with Coverage**.
3. Open the coverage tool window and drill into `Main_IssueN.java` to see
   line/branch coverage highlighted in the editor gutter.

## How to work through each exercise

1. Open the corresponding `taskN.md` file and read the learning objective
   and steps before touching any code.
2. Run the existing tests with coverage first, and record the baseline
   coverage percentage — you'll compare against it later.
3. Follow the steps in the task file (they mirror the numbered steps in
   each `Main_IssueN.java` Javadoc comment).
4. Answer the reflection questions in your own words as you go — they're
   the point of the exercise, not the code change itself.
5. Re-run with coverage after each change and compare against your
   baseline.

Work through the issues in order (1 → 5); each one builds on the coverage
vocabulary and intuition from the previous one.
