import org.example.Main_Issue5;
import org.junit.jupiter.api.Test;

class MainTest_Issue5 {

    @Test
    public void testIsEven() {
        Main_Issue5 example = new Main_Issue5();
        boolean even = example.isEven(2);
    }
    @Test
    public void testFlag1(){
        Main_Issue5 example = new Main_Issue5();
        boolean b = example.flagChecker1(true);
    }

    @Test
    public void testFlag2(){
        Main_Issue5 example = new Main_Issue5();
        example.flagChecker2(true);
        boolean b1 = example.flagChecker2(false);
    }

}