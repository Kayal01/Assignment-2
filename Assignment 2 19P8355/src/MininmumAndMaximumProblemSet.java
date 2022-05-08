import org.junit.Test;
import static org.junit.Assert.*;
public class MininmumAndMaximumProblemSet {
    @Test
    public void testOne(){
        MinimumAndMaximum y = new MinimumAndMaximum();
        int[] x = {3284,356,32233,455,665,4,9};
        assertEquals(4,y.getMin(x));
        assertEquals(32233, y.getMax(x));
    }
    @Test
    public void testTwo(){
        MinimumAndMaximum y = new MinimumAndMaximum();
        int[] x = {345,6,4232,13,566,64,8};
        assertEquals(6,y.getMin(x));
        assertEquals(4232, y.getMax(x));
    }
    @Test
    public void testThree(){
        MinimumAndMaximum y = new MinimumAndMaximum();
        int[] x = {7,2};
        assertEquals(2,y.getMin(x));
        assertEquals(7, y.getMax(x));
    }
    @Test
    public void testFour(){
        MinimumAndMaximum y = new MinimumAndMaximum();
        int[] x = {9};
        assertEquals(9,y.getMin(x));
        assertEquals(9, y.getMax(x));
    }
    @Test
    public void testFive(){
        MinimumAndMaximum y = new MinimumAndMaximum();
        int[] x = {45,67,890,6452323,5565,776776,77654,};
        assertEquals(45,y.getMin(x));
        assertEquals(6452323, y.getMax(x));
    }

}
