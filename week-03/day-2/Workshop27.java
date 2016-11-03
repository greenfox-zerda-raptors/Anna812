/**
 * Created by PHAZEK on 11/3/2016.
 */
public class Workshop27 {
    public static void main(String[] args) {
        String y = "seasons";
        int out = 6;
        // if the last and the first letter of the string
        // are the same, double the variable
        // called out, if not half it
        int b = y.lastIndexOf(y);
        if (y.charAt(0) == y.charAt(b)){
            out = out * 2;
        }
        else {
            out = out / 2;
        }
        System.out.println(out);
    }
}
