/**
 * Created by Anna812 on 11/5/2016.
 */
public class Workshop11 {
    public static void main(String[] args) {
        String[] ah = new String[] {"kuty", "macsk", "cic"};
        // add to all elements an 'a' on the end

//        for (String element: ah) {
//            element += "a";
//            System.out.println(element);
//        }

        for (int i = 0; i < ah.length; i++) {
            ah[i] += "a";
        }

        for (String element: ah) {
            System.out.println(element);
        }
    }
}
