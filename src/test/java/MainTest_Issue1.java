import org.example.Main_Issue1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest_Issue1 {

    @Test
    public void test1(){
        Main_Issue1 main = new Main_Issue1();
        assertEquals(main.add(0.0,2.0),2.0);
    }

    //TODO
    //Add another test to expose the bug
}