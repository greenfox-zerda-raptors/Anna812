/**
 * Created by Anna812 on 11/9/2016.
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: Having raised exceptions, then what?  I'm looking to get some
 * closure here.  "Finally" would do... whatever else, this is what I need if something goes
 * wrong...
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop08{
    public static void myMethod(int testnum) throws Exception // something should appear here before
    {
        System.out.println("start - myMethod");
        throw new Exception();
    }

    public static void main(String[] args) {
        int age = 5555;
        try {
            System.out.println("try - first statement");
            myMethod(age);
            System.out.println("try - last statement");
        }
        catch (Exception ex) {
            System.out.println("An Exception occurred");
        }
        finally {
            System.out.println("Finally I did this instead");
        }
        System.out.println("::::FINISH LINE:::: out of the try/catch/finally statement");
    }
}
