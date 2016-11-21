import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Anna812 on 11/21/2016.
 */
public class AppleTest {

    private Apple apple;
    private ArrayList<Integer> alTest;

    @Before
    public void setUp() throws Exception {
        apple = new Apple();
    }

    @Test
    public void getApple() throws Exception {
        assertEquals("apple", apple.getApple());
    }

    @Test
    public void sumApples() throws Exception {
        alTest = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(10, apple.sumApples(alTest));
    }

    @Test
    public void sumApplesEmpty() throws Exception {
        alTest = new ArrayList<>();
        assertEquals(0, apple.sumApples(alTest));
    }

    @Test
    public void sumApplesOneElement() throws Exception {
        alTest = new ArrayList<>(123);
        assertEquals(0, apple.sumApples(alTest));
    }

    @Test (expected = NullPointerException.class)
    public void sumApplesNull() throws Exception {
        alTest = new ArrayList<>(null);
        assertNull(apple.sumApples(alTest));
    }
}