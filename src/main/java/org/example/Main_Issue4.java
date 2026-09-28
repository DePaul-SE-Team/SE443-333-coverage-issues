package org.example;

/**
 * Q4: Does 100% coverage mean all edge case has been covered?
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