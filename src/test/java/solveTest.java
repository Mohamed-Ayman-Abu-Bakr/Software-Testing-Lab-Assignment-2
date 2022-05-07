import org.junit.Test;

import static org.junit.Assert.*;

public class solveTest {
    @Test
    public void test_even_odd(){
        for(int i=-100;i<=100;i+=2){
            assertEquals("Even",solve.even_odd(i));
        }
        for(int i=-99;i<=100;i+=2){
            assertEquals("Odd",solve.even_odd(i));
        }
    }

    @Test
    public void test_max_min(){
        int [] arr = new int[]{-2,5,3,1,-6,6,2};
        int [] expected = new int[]{6,-6};
        int [] actual = solve.max_min(arr);
        assertEquals(expected[0],actual[0]);
        assertEquals(expected[1],actual[1]);
    }

}