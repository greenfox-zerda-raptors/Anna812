import java.util.Arrays;

/**
 * Created by Anna812 on 11/5/2016.
 */
public class Workshop14 {
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[] {3, 4, 5, 6, 7, 8};
//        int temp = ah[ah.length -1];
//        ah[ah.length-1] = ah[0];
//        ah[0] = temp;
//        temp = ah[ah.length -2];
//        ah[ah.length -2] = ah[1];
//        ah[1] = temp;
//        System.out.println(Arrays.toString(ah));
        int k = 1;
        for (int i = 0; i < ah.length/2; i++) {
                int temp = ah[i];
                ah[i] = ah[ah.length-k];
                ah[ah.length-k] = temp;
            k++;
        }
        System.out.println("Vege:"+Arrays.toString(ah));
    }
}