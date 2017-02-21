import java.util.ArrayList;

/**
 * Created by Anna on 17/02/21.
 */
public class Euler03 {
    public static void main(String[] args) {
        System.out.println(primeFactor(600851475143L));
    }

    private static int primeFactor(long input) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= input; i++) {
            while (input % i == 0) {
                factors.add(i);
                input /= i;
            }
        }
        return factors.get(factors.size() - 1);
    }
}
