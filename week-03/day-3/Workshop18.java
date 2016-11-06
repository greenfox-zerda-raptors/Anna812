/**
 * Created by Anna812 on 11/5/2016.
 */
public class Workshop18 {
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter
        int z = 1000;
        System.out.println(sumRecursive(z));

    }
    public static int sum (int maxA) {
        int x = 0;
        for (int i = 0; i <= maxA; i++){
            x += i;
        }
        return x;
    }

    public static int sumRecursive (int maxA) {
        if (maxA == 1) return 1;
        return maxA + sumRecursive(maxA-1);
    }
}
