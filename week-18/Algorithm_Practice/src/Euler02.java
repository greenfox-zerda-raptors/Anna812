/**
 * Created by Anna on 17/02/21.
 */
public class Euler02 {
    public static void main(String[] args) {
        System.out.println(sumOfFibonacciEvenNums(33));
    }

    private static int sumOfFibonacciEvenNums(int limit) {
        int sum = 0;
        int fibValue;
        for (int i = 0; i <= limit; i++){
            fibValue = fibonacci(i);
            if(fibValue % 2 == 0) {
                sum += fibValue;
            }
        }
        return sum;
    }

    private static int fibonacci(int index) {
        if(index <= 1) {
            return index;
        } else {
            return fibonacci(index - 2) + fibonacci(index - 1);
        }
    }
}
