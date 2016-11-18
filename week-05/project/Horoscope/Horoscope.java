package com.horoscopeGenerator.AnnaDalnoki;

import java.util.Random;

/**
 * Created by Anna812 on 11/18/2016.
 */
public class Horoscope {

    public String content;

    public Horoscope() {
        DestinyList dl = new DestinyList();
        this.content = dl.pickingDestiny();
    }

    public String getContent() {
        return content;
    }
}




