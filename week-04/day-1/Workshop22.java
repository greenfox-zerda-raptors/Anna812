/**
 * Created by Anna812 on 11/7/2016.
 */
public class Workshop22 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first second third third");
        // Accidentally I inserted the word "third" twice. Your task is to change the last word to "fourth"
        // Expected output: first second third fourth
        sb.replace(sb.lastIndexOf("third"), sb.length(), "fourth");
        System.out.println(sb.toString());
    }
}
