/**
 * Created by PHAZEK on 11/3/2016.
 */
public class Workshop33 {
    public static void main(String[] args) {
        // print the even numbers till 20
        for (int a = 0; a <= 20; a++) {
            if (a % 2 == 1)
                continue;
            System.out.print(a);
        }
    }
}
