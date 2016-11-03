/**
 * Created by PHAZEK on 11/3/2016.
 */
public class Workshop22 {
    public static void main(String... args){
        String first = "I am the first string!";
        String second = "I think I'm longer than first..";
        // Decide if "first" string is longer than "second" string and store it in a variable
        // Print the value of the variable
        if (first.length() > second.length()) {
            System.out.println(String.format("%s is longer than %s", first, second));
        }
        else {
            System.out.println(String.format("%s is not longer than %s", first, second));
        }
        System.out.println(first.length());
        System.out.println(second.length());
    }
}
