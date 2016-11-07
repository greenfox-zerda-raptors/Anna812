/**
 * Created by Anna812 on 11/7/2016.
 */
public class Workshop18 {
    public static void main(String... args){
        String example = "A long example string";
        example.replace("long", "short");
        // I would like to replace "long" with "short" in this example, but it has a problem. Please fix it! Don't forget that String is immutable
        // Expected output: A short example string
        StringBuilder a = new StringBuilder(example);
        a.replace(2, 6, "short");
        System.out.println(a);
    }
}
