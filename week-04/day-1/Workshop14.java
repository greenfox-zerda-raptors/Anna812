import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Anna812 on 11/20/2016.
 */
public class Workshop14 {

    public static void main(String... args) {
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + "a");
        }
    }
}
