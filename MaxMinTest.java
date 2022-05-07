import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {

    MaxMin maxmin = new MaxMin();

    @Test
    public void arr1(){
        int []a = {};
        assertEquals(-1,maxmin.isMax(a));
        assertEquals(-1,maxmin.isMin(a));
    }

    @Test
    public void arr2(){
        int []a = {304,9999,990,-12,-10000,20,11};
        assertEquals(9999,maxmin.isMax(a));
        assertEquals(-10000,maxmin.isMin(a));
    }

}