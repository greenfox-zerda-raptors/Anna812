import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by Anna812 on 11/7/2016.
 */
public class Workshop05 {
    public static void main(String... args){
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array

//        Object [] a = new Object[numList.size()];
//        numList.toArray(a);

        int [] a = new int [numList.size()];
        for (int i = 0; i < numList.size(); i++){
            a[i] = numList.get(i);
        }

        for (int x : a) {
            System.out.println(x);
        }
    }
}
