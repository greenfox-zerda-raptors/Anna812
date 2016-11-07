/**
 * Created by Anna812 on 11/7/2016.
 */
public class Workshop21 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first third fourth");
        // Add "second" to the StringBuilder (sb) between the words "first" and "third"
        // Expected output: first second third fourth
        sb.insert(sb.indexOf("third"), "second ");
        System.out.println(sb.toString());
    }
}
