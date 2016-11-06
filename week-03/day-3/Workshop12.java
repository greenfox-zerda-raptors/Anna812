import java.util.Arrays;

/**
 * Created by Anna812 on 11/5/2016..
 */
public class Workshop12 {
    public static void main(String[] args) {
        // Swap the first element of the array
        // Expected output: third second first

        String[] abc = new String[] { "first", "second", "third"};
        String temp = abc[0];
        abc [0] = abc [2];
        abc [2] = temp;
        System.out.println(Arrays.toString(abc));
    }
}
