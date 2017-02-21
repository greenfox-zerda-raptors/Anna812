/**
 * Created by Anna on 17/02/21.
 */
public class Euler02 {
    public static void main(String[] args) {
        fibonacci(6);
    }

    private static int sumOfFibonacciEvenNums(int limit) {
        return 0;
    }

    private static int fibonacci(int limit) {
            if(limit < 1) {
                return limit;
            } else {
                return fibonacci(limit - 2) + fibonacci(limit - 1);
            }
    }
}
