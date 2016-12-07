import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anna on 12/6/2016.
 */
public class NumberConverterTest {

    @Test
    public void shouldReturnIfor1() {
        assertEquals("I", NumberFormatConverter.arabicToRoman(1));
    }

    @Test
    public void shouldReturnIIfor2() {
        assertEquals("II", NumberFormatConverter.arabicToRoman(2));
    }

    @Test
    public void shouldReturnIIIfor3() {
        assertEquals("III", NumberFormatConverter.arabicToRoman(3));
    }

    @Test
    public void shouldReturnIVfor4() {
        assertEquals("IV", NumberFormatConverter.arabicToRoman(4));
    }

    @Test
    public void shouldReturnVfor5() {
        assertEquals("V", NumberFormatConverter.arabicToRoman(5));
    }

    @Test
    public void shouldReturnVIfor6() {
        assertEquals("VI", NumberFormatConverter.arabicToRoman(6));
    }

    @Test
    public void shouldReturnVIIfor7() {
        assertEquals("VII", NumberFormatConverter.arabicToRoman(7));
    }

    @Test
    public void shouldReturnVIIIfor8() {
        assertEquals("VIII", NumberFormatConverter.arabicToRoman(8));
    }

    @Test
    public void shouldReturnIXfor9() {
        assertEquals("IX", NumberFormatConverter.arabicToRoman(9));
    }

    @Test
    public void shouldReturnXfor10() {
        assertEquals("X", NumberFormatConverter.arabicToRoman(10));
    }

    @Test
    public void shouldReturnXVIIIfor18() {
        assertEquals("XVIII", NumberFormatConverter.arabicToRoman(18));
    }

    @Test
    public void shouldReturnXXXVIIIfor38() {
        assertEquals("XXXVIII", NumberFormatConverter.arabicToRoman(38));
    }
}
