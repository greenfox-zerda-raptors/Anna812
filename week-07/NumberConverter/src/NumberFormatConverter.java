/**
 * Created by Anna on 12/6/2016.
 */
public class NumberFormatConverter {
    public static String arabicToRoman(int arabic) {
        StringBuilder result = new StringBuilder();
        int remaining = arabic;

        String[] symbols = new String[]{"X", "IX", "V", "IV", "I"};
        Integer[] values = new Integer[]{10, 9, 5, 4, 1};

        for(int i = 0; i<values.length; i++) {
            remaining = appendRomanNumeral(remaining, values[i], symbols[i], result);
        }

        return result.toString();
    }

    private static int appendRomanNumeral(int numeral, int value, String romanSymbol, StringBuilder builder) {
        while(numeral >= value) {
            builder.append(romanSymbol);
            numeral -= value;
        }
        return numeral;
    }
}