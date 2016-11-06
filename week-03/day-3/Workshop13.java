/**
 * Created by Anna812 on 11/5/2016.
 */
public class Workshop13 {
    public static void main(String[] args) {
        int[] ah = new int[]  {3, 4, 5, 6, 7};
        // print the sum of all numbers in ah

//        int sum = ah[0] + ah[1] + ah[2] + ah[3] + ah[4];
//        System.out.println(sum);

//        int sum = 0;
//        for (int i= 0; i < ah.length; i++) {
//            sum += ah[i];
//        }
//        System.out.println(sum);

        int sum = 0;
        for (int element : ah) {
            sum += element;
        }
        System.out.println(sum);
    }
}
