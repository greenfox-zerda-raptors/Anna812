/**
 * Created by Anna on 17/02/17.
 */
public class finalExam {
    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3};
        int[] second = new int[]{6, 7, 8};
        for (int temp : mixTwoArrays(first, second)) {
            System.out.println(temp);
        }

    }

    public static int[] mixTwoArrays(int[] one, int[] two) {
        int[] result =  new int[one.length + two.length];
        for (int i = 0; i < one.length; i++){
            result[i] = one[i];
            result[ i + 1 ] = two[i];
        }
        return result;
    }
}
