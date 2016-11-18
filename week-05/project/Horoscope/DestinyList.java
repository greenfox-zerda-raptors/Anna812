package com.horoscopeGenerator.AnnaDalnoki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Anna812 on 11/18/2016.
 */
public class DestinyList {

    public ArrayList<String> ls;

    public DestinyList() {
        ls = new ArrayList<>();
        loadDestiny();
    }


    public void loadDestiny() {
        try {
            FileReader inputFile = new FileReader("source.txt");
            BufferedReader bufferReader = new BufferedReader(inputFile);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                ls.add(line);
            }
            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Error while reading file line by line:" + e.getMessage());
        }
    }

    public String pickingDestiny() {
        Random r = new Random();
        int i = r.nextInt(ls.size());
        return ls.get(i);
    }
}
