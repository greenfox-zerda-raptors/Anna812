import java.util.ArrayList;

/**
 * Created by Anna812 on 11/21/2016.
 */
public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 0; i <= 14; i++) {
            System.out.print(i + "." + fibonacci(i) + ", ");
        }
    }

    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}
