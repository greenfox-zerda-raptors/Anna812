package main.java.music;

/**
 * Created by Anna812 on 11/16/2016.
 */
public abstract class StringedInstrument extends Instrument {

    public int numberOfStrings;
    public String sound;
    final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, sound);
    }

}
