import org.example.Main_Issue3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest_Issue3 {

    @Test
    public void test1(){
        Main_Issue3 main = new Main_Issue3();
        assertEquals(main.add(2.0,4.0),6.0);
    }

    @Test
    public void test2(){
        Main_Issue3 main = new Main_Issue3();
        assertEquals(main.add(2.0,2.0),4.0);
    }
}