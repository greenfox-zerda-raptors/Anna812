import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Anna812 on 11/7/2016.
 */
public class Workshop10{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "sixth", "third", "fourth", "fifth"));
        // Accidentally I added "sixth" instead of "second"! Your task is to swap "sixth" with "second"
        list.set(list.indexOf("sixth"), "second");
        System.out.println(list);
    }
}
