import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Anna812 on 11/21/2016.
 */
public class FibonacciTest {

    @Test
    public void fibonacci() throws Exception {
        assertEquals(377, Fibonacci.fibonacci(14));
    }

    @Test
    public void fibonacciZero() throws Exception {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void fibonacciNeg() throws Exception {
        assertEquals(-5, Fibonacci.fibonacci(-5));
    }

}