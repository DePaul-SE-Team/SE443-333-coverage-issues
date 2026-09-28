package org.example;

/**
 * Q5: Can you get 100% coverage without any assertions?
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