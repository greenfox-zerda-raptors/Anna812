/**
 * Created by Anna812 on 11/20/2016.
 */
public class Workshop37 {

    public static void main(String[] args) {
        // Write a program which has this output
        //# # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replacable, hence store it in a variable

        String hash = "#";
        for (int i = 0; i < 7; i++){
            System.out.println();
            for (int j = 0; j < 7; j++){
                if (i%2 == 1) {
                    System.out.printf(" %s", hash);
                } else {
                    System.out.printf("%s ", hash);
                }
            }
            }
    }
}
