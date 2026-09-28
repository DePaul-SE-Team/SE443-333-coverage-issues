import org.example.Main_Issue2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest_Issue2 {

    @Test
    public void test1(){
        Main_Issue2 main = new Main_Issue2();
        assertEquals(main.add(2.0,4.0),6.0);
    }

    @Test
    public void test2(){
        Main_Issue2 main = new Main_Issue2();
        assertEquals(main.add(2.0,2.0),4.0);
    }
}