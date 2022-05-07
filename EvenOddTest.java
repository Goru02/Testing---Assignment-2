import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    EvenOdd test = new EvenOdd();

    @Test
    public void zeroIsEven(){
        assertEquals("Even", test.checkEvenOdd(0));
    }

    @Test
    public void sixIsEven(){
        assertEquals("Even", test.checkEvenOdd(6));
    }

    @Test
    public void thirtyIsEven(){
        assertEquals("Even", test.checkEvenOdd(30));
    }

    @Test
    public void thirtyFourIsEven(){
        assertEquals("Even", test.checkEvenOdd(34));
    }

    @Test
    public void oneIsOdd(){
        assertEquals("Odd", test.checkEvenOdd(1));
    }

    @Test
    public void fiftyOneIsOdd(){
        assertEquals("Odd", test.checkEvenOdd(51));
    }

    @Test
    public void ninetyThreeIsOdd(){
        assertEquals("Odd", test.checkEvenOdd(93));
    }
}