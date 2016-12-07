import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anna on 12/6/2016.
 */
public class AccumTest {

    @Test
    public void shouldReturnAfora() {
        assertEquals("A", Accumul.accum("a"));
    }

    @Test
    public void shouldReturnABbforab() {
        assertEquals("A-Bb", Accumul.accum("ab"));
    }

    @Test
    public void shouldReturnABbCccforabc() {
        assertEquals("A-Bb-Ccc", Accumul.accum("abc"));
    }
}
