import java.util.Arrays;

/**
 * Created by PHAZEK on 11/4/2016.
 */
public class Workshop07 {
    public static void main(String[] args) {
        // What's the problem with this code fragment? Fix it!
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = i * i;
        System.out.println(Arrays.toString(array));
    }
}
