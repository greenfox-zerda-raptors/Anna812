/**
 * Created by Anna on 17/02/21.
 */
public class Euler01 {
    public static void main(String[] args) {
        System.out.println(sumOfMultiplesOfThreeOrFive(1000));
    }

    public static int sumOfMultiplesOfThreeOrFive(int limit) {
        int sum = 0;
        int i = 0;
        while (i <= limit) {
            if (multipleOfThree(i) | multipleOfFive(i)) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static boolean multipleOfFive(int input) {
        return input % 5 == 0;
    }

    public static boolean multipleOfThree(int input) {
        return input % 3 == 0;
    }
}
