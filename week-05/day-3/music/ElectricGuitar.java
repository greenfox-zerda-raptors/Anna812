package main.java.music;

/**
 * Created by Anna812 on 11/16/2016.
 */
public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this(6);
    }

    public ElectricGuitar (int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.sound = "Twang";
    }
}
