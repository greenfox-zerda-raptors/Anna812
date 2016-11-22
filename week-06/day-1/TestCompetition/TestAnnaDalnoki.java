import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Anna812 on 11/21/2016.
 */
public class TestAnnaDalnoki {

    private WordToolbox wtb;

    @Before
    public void setUp() throws Exception {
        wtb = new WordToolbox("Tarzan's toenails");
    }

    @Test
    public void countHowManyA() throws Exception {
        assertEquals(3, wtb.countHowMany('a'));
    }

    @Test
    public void countHowManyQ() throws Exception {
        assertEquals(0, wtb.countHowMany('q'));
    }

    @Test
    public void countHowManySpace() throws Exception {
        assertEquals(1, wtb.countHowMany(' '));
    }

    @Test
    public void countHowManyzero() throws Exception {
        assertEquals(0, wtb.countHowMany('0'));
    }

    @Test
    public void countHowManyUppercase() throws Exception {
        assertEquals(2, wtb.countHowMany('T'));
    }

    @Test
    public void countHowManyApostrophe() throws Exception {
        assertEquals(1, wtb.countHowMany('\''));
    }
}