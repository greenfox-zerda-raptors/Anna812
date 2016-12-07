/**
 * Created by Anna on 12/6/2016.
 */
public class Accumul {
    public static String accum(String a) {

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < a.length(); i++) {
            builder.append(Character.toUpperCase(a.charAt(i)));

            for(int j = 0; j < i; j++) {
                builder.append(a.charAt(i));
            }
            builder.append("-");
        }
        return builder.toString();
    }
}
