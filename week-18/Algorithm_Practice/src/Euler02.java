/**
 * Created by Anna on 17/02/21.
 */
public class Euler02 {
    public static void main(String[] args) {
        System.out.println(sumOfFibonacciEvenNums());
    }

    private static int sumOfFibonacciEvenNums() {
        int sum = 0;
        int fibValue = 0;
        int count = 0;
        while (fibValue <= 4000000) {
            fibValue = fibonacci(count);
            if(fibValue % 2 == 0) {
                sum += fibValue;
            }
            count++;
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
