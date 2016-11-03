/**
 * Created by PHAZEK on 11/3/2016.
 */
public class Workshop35 {
    public static void main(String[] args) {
        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567
        String s = "******";
        for (int x = 0; x < 7; x++){
            String newS = s.substring(0,x)+(x+1) + s.substring(x);
            System.out.println(newS);
        }
    }
}

//    char[] arrayChar = new char[7];

