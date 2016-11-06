import java.util.Arrays;

/**
 * Created by PHAZEK on 11/4/2016.
 */
public class Workshop09 {
    public static void main(String[] args) {
        int[] ag = new int[] { 3, 4, 5, 6, 7 };
        // please double all the elements of the list
        for(int x = 0; x < ag.length; x++) {
            ag[x] *= 2;
        }
        System.out.println(Arrays.toString(ag));
    }
}
