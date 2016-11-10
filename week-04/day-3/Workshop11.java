/**
 * Created by Anna812 on 11/10/2016.
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: Throw multiple exceptions
 * Go back to the Workshop07 (7 ate 9) and extend it to also throw an exception for 9 (it's no longer
 * useful as a number, it's just a "pile of bones")
 * see the example at http://beginnersbook.com/2013/12/throws-keyword-example-in-java/
 * to see how one can create multiple throws
 * INPUT? 7
 * Exception: 7's are cannibals
 * INPUT? 9
 * Exception: Nothing but bones
 **************************************************************************************************/
import java.util.*;
public class Workshop11{
    public static void myMethod(int testnum) throws Exception // something should appear here before
    {
        if (testnum == 7) // do that thing that chucks the reprobate out
            throw new Exception("7's are cannibals");
        else if (testnum == 9)
            throw new Exception("Nothing but bones");
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int age;
        String prompt = "Enter any number, 0 to exit?";
        System.out.println(prompt);
        while (userInput.hasNextInt()) {
            age = userInput.nextInt();
            if (age == 0) {
                break;
            } else {
                try {
                    myMethod(age);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
