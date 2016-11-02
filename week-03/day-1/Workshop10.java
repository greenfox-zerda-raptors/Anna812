/**
 * Created by PHAZEK on 11/2/2016.
 */
public class Workshop10{
    public static void main(String[] args) {
        int j1 = 10;
        int j2 = 3;
        // tell if j1 is between j2 squared and j2 cubed
        boolean Between1 = (int) Math.pow (j2, 2) < j1;
        boolean Between2 = j1 < (int) Math.pow (j2, 3);
        boolean Between = Between1 = Between2;
        System.out.println(Between1);
        System.out.println(Between2);
        System.out.println(Between);
    }
}
