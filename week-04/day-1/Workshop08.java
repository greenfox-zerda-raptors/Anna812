import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Anna812 on 11/7/2016.
 */
public class Workshop08 {
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        String contSeven = arrayList.contains(7) ? "Hoorray" : "Noooooo";
        System.out.println(contSeven);
    }
}
