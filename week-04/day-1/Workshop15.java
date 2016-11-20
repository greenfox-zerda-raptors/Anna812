import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Anna812 on 11/20/2016.
 */
public class Workshop15 {

    public static void main(String... args) {
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7"));
        // Add "a" to every string in al. Use a for(each) loop

        for (String str : al) {
            System.out.println(str + "a");
        }
    }
}

