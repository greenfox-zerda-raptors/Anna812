package main.java.music;

/**
 * Created by Anna812 on 11/16/2016.
 */
public class ElectricBassGuitar extends StringedInstrument{

    public ElectricBassGuitar() {
        this(4);
    }

    public ElectricBassGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.sound = "Duum-duum-duum";
    }


}
