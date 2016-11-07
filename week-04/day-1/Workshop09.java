import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Anna812 on 11/7/2016.
 */
public class Workshop09 {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("second", "third", "fourth"));
        // Add "first" to the beginning of the list and add "fifth" to the end of the list
        // Expected output: [first, second, third, fourth, fifth]
        list.add(0, "first");
        list.add(list.size(), "fifth");
        System.out.println(list);
    }
}
