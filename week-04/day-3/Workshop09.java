/**
 * Created by Anna812 on 11/9/2016.
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: I have to have it my way.  When an exception occurs, I want a
 * special error message, namely "7's are cannibals!" printed.
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * 7's are cannibals
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 * Refer to Workshop07
 **************************************************************************************************/
import java.util.*;

public class Workshop09{

    static void myMethod(int inNumber) throws Exception {
            System.out.println("start - myMethod");
            throw new Exception("7's are cannibals!");
    }

    public static void main(String  args[]) {
        int age = 5555;
        try {
            System.out.println("try - first statement");
            myMethod(age);
            System.out.println("try - last statement");
        }
        catch (Exception ex) {
            System.out.println("An Exception occurred");
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally I did this instead");
        }
        System.out.println("::::FINISH LINE:::: out of the try/catch/finally statement");
    }
}