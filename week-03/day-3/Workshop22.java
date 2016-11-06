import java.util.Arrays;

/**
 * Created by Anna812 on 11/5/2016.
 */
public class Workshop22 {
    public static void main(String[] args) {
        // create a function which prints the input String parameters (can have multiple number of arguments)
        print("hello", "hi", "konbanwa");
    }
    public static void print (String... a) {
        System.out.println(Arrays.toString(a));
    }
}