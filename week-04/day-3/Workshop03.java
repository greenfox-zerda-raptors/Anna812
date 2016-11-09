/**************************************************************************************************
 * Workshop: Practice With Exceptions: Arithmetic Overflow
 * Write a routine that catches an arithmetic overflow (that is, larger than the Integer.MAX_VALUE)
 * Note that Integer and int are NOT the same thing; and that Integer offers you properties such as
 * MAX_VALUE.
 * Use the Scanner routine to take the input from the keyboard; if the value is okay then
 * print "Yum", and then 1/2 the value entered.  For example:-
 * INPUT or 0 to end?  12334556677723131
 * Invalid value
 * (and the Java exception messages)
 * INPUT or 0 to end?  12345678
 * Yum 1234
 * INPUT or 0 to end?  123456
 * Yum 123
 * INPUT or 0 to end? 0
 * Bye!
 **************************************************************************************************/
/**
 * Created by Anna812 on 11/9/2016.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Workshop03 {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE);
        System.out.println("INPUT or 0 to end?");
        arithmeticEx();
    }

    public static void arithmeticEx () {

        try {
            int a = userInput.nextInt();
            if (a == 0) {
                System.out.println("Bye!");
            }
            else {
                String b = Integer.toString(a);
                System.out.println("Yum " + b.substring(0, (b.length())/2));
                System.out.println("INPUT or 0 to end?");
                userInput.nextLine();
                arithmeticEx();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid value");
            System.out.println(e);
            System.out.println("INPUT or 0 to end?");
            userInput.nextLine();
            arithmeticEx();
        }
    }
}


