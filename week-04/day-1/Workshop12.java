import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Anna812 on 11/7/2016.
 */
public class Workshop12 {
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        String s = list.containsAll(listB) ? "true" : "false";
        System.out.println(s);
    }
}
