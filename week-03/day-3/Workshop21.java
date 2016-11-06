/**
 * Created by Anna812 on 11/6/2016.
 */
public class Workshop21 {
    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial
        int a = 4;
        System.out.println(factorial(a));
    }
    public static long factorial(int n) {
        System.out.println(n);
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
}
