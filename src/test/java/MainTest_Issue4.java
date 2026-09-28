import org.example.Main_Issue4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest_Issue4 {

    @Test
    public void testIsEven() {
        Main_Issue4 example = new Main_Issue4();
        assertTrue(example.isEven(2));
        assertFalse(example.isEven(3));
    }
    @Test
    public void testFlag1(){
        Main_Issue4 example = new Main_Issue4();
        assertEquals(true,example.flagChecker1(true));
        assertEquals(false,example.flagChecker1(false));
    }

    @Test
    public void testFlag2(){
        Main_Issue4 example = new Main_Issue4();
        assertEquals(true,example.flagChecker2(true));
        assertEquals(false,example.flagChecker2(false));
    }
}