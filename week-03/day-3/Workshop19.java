/**
 * Created by Anna812 on 11/5/2016.
 */
public class Workshop19 {
    public static void main(String[] args) {
        // create a function that returns it's input factorial
        int a = 4;
        System.out.println(factorial(a));
    }
    public static int factorial (int a) {
        int x = 1;
        for(int i = 0; i < a; i++){
            x = x * i + x;
        }
        return x;
    }
}
