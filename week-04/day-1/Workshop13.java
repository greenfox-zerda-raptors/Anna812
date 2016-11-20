import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Anna812 on 11/20/2016.
 */
public class Workshop13 {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list using a for loop and an Iterator

        for (Iterator itr = list.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }
    }
}
