package main.java.music;

/**
 * Created by Anna812 on 11/16/2016.
 */
public class Violin extends StringedInstrument {


    public Violin() {
        this(4);
    }

    public Violin (int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.sound = "Screech";
    }

}
