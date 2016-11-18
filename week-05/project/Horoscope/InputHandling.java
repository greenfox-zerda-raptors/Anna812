package com.horoscopeGenerator.AnnaDalnoki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Anna812 on 11/18/2016.
 */
abstract public class InputHandling {

    public static void print() {
        String intro = "Now you may find it inconceivable or at the very least a bit unlikely\n" +
                "that the relative position of the planets and the stars could have\n" +
                "a special deep significance or meaning that exclusively applies to only you,\n" +
                "but let me give you my assurance that these forecasts and predictions\n" +
                "are all based on solid, scientific, documented evidence, so you would have\n" +
                "to be some kind of moron not to realize that every single one of them is absolutely true.\n";
        System.out.println(intro);
    }

    public static boolean isValid(String sign) {
        ArrayList<String> zodiac = new ArrayList<>(Arrays.asList("aquarius", "pisces", "aries", "taurus",
                "gemini", "cancer", "leo", "virgo", "libra", "scorpio", "sagittarius", "capricorn"));
        if (zodiac.contains(sign.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public static void commandReading(String input) {
        if (InputHandling.isValid(input)){
            Horoscope newHoroscope = new Horoscope();
            System.out.println(newHoroscope.getContent());
        } else {
            System.out.println("That is not a sign, my darling. Please try again.");
        }
    }


}
