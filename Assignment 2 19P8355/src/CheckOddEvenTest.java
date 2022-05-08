import org.junit.Test;
import static org.junit.Assert.*;
public class CheckOddEvenTest {

    @Test
    public void ETest1(){
        CheckOddEven x = new CheckOddEven();
        int n = 22;
        assertEquals("it is even",x.checking(n));
    }
    @Test
    public void ETest2(){
        CheckOddEven x = new CheckOddEven();
        int n = 4456;
        assertEquals("it is even",x.checking(n));
    }
    @Test
    public void ETest3(){
        CheckOddEven x = new CheckOddEven();
        int n = 0;
        assertEquals("it is even",x.checking(n));
    }
    @Test
    public void OTest1(){
        CheckOddEven x = new CheckOddEven();
        int n = 79;
        assertEquals("it is odd",x.checking(n));
    }
    @Test
    public void OTest2(){
        CheckOddEven x = new CheckOddEven();
        int n = 945;
        assertEquals("it is odd",x.checking(n));
    }
    @Test(expected = IllegalArgumentException.class)
    public void negative(){
        CheckOddEven x = new CheckOddEven();
        int n = -100;
        x.checking(n);
    }


}
