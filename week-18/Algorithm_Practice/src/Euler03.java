import java.util.ArrayList;

/**
 * Created by Anna on 17/02/21.
 */
public class Euler03 {
    public static void main(String[] args) {
        for (int temp : primeFactor(600851475143L)) {
            System.out.println(temp);
        }
    }

    private static ArrayList<Integer> primeFactor(long input) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= input; i++) {
            while (input % i == 0) {
                factors.add(i);
                input /= i;
            }
        }
        return factors;
    }
}
