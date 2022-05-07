import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatchTest {

    Watch watch = new Watch();

    @Test
    void Test1() {
        String str = "Bda";
        assertEquals(WatchOp.watchfunc(str, watch), "Error wrong input. input can only be (a,b,c,d)");
    }
    @Test
    void Test2(){
        String str = "caabbd";
        assertEquals(WatchOp.watchfunc(str, watch), "2000-1-3");
    }
    @Test
    void Test3(){
        String str = "caaabd";
        assertEquals(WatchOp.watchfunc(str, watch), "2000-2-1");
    }
}

