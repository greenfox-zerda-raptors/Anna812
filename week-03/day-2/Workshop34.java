/**
 * Created by PHAZEK on 11/3/2016.
 */
public class Workshop34 {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".
        for (int a = 1; a <= 100; a++){
            if (a % 3 == 0 && a % 5 ==0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (a % 3 == 0){
                System.out.println("Fizz");
                continue;
            }
            if (a % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            else System.out.println(a);
        }
    }
}
