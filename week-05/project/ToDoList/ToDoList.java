package com.ToDoApp.AnnaDalnoki;

import java.io.*;
import java.nio.BufferOverflowException;
import java.util.ArrayList;

/**
 * Created by Anna812 on 11/17/2016.
 */
public class ToDoList {

    public ArrayList<ToDoItem> ls;

    public ToDoList() {
        ls = new ArrayList<>();
    }

    public void add(ToDoItem item) {
        if (item.getContent().equals("")){
            System.out.println("Unable to add: No task is provided");
        } else {
            ls.add(item);
        }
    }

    public void remove(int index) {
        try{
            ls.remove(index - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Unable to remove: Index is out of bound");
        }
    }

    public void list() {
        if(ls.size() == 0) {
            System.out.println("No todos for today! :)");
        } else {
            for (int i = 0; i < ls.size(); i++) {
                ToDoItem item = ls.get(i);
                System.out.println(i + 1 + " - " + item.toString());
            }
        }
    }

    public void makeCompleted(int i) {
        try{
            ToDoItem item = ls.get(i - 1);
            item.setComplete(true);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Unable to complete: Index is out of bound");
        }
    }

    public void writeToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ToDoList.csv"));
            for (ToDoItem tdi : ls) {
                if (tdi.getComplete() == true) {
                    bw.write("checked;");
                }
                bw.write("not_checked;");
                bw.write(tdi.getContent());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile() {
        String line;
        boolean b;
        try {
            BufferedReader br = new BufferedReader(new FileReader("ToDoList.csv"));
            while ((line = br.readLine()) != null) {
                String[] item = line.split(";");
                if (item[0].equals("checked")){
                    b = true;
                } else {
                    b = false;
                }
                ToDoItem temp = new ToDoItem(item[1], b);
                this.add(temp);
            } br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
