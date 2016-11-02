/**
 * Created by PHAZEK on 11/2/2016.
 */
public class Workshop11{
    public static void main(String[] args) {
        int k = 1521;
        // tell if k is dividable by 3 or 5
        boolean DivideBy3 = k % 3 == 0;
        boolean DivideBy5 = k % 5 == 0;
        System.out.println(DivideBy3);
        System.out.println(DivideBy5);
    }
}