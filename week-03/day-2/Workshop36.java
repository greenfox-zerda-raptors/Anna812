/**
 * Created by Anna812 on 11/20/2016.
 */
public class Workshop36 {

    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable

        String hash = "#";
        for (int i = 0; i < 5; i++){
            System.out.println();
            for (int j = 0; j < 5; j++){
                System.out.printf(" %s", hash);
            }
        }
    }
}
