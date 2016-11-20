import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Anna812 on 11/20/2016.
 */
public class Workshop16 {

    public static void main(String... args){

        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7 ));
        // Fix this code fragment! It should remove every even number from the list.

        for(Iterator<Integer> itr = al.iterator(); itr.hasNext();) {
            if(itr.next()%2 == 0) {
                itr.remove();
            }
        }
        System.out.println(al);
    }
}
