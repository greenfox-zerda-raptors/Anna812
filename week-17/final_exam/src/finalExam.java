/**
 * Created by Anna on 17/02/17.
 */
public class finalExam {
    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3};
        int[] second = new int[]{6, 7, 8};

        for (int temp : mixTwoArrays(first, second)) {
            System.out.print(temp + ", ");
        }

        System.out.println();

        for (int temp : mixArrays(first, second)) {
            System.out.print(temp + ", ");
        }
    }

    public static int[] mixTwoArrays(int[] one, int[] two) {
        int j = 0;
        int[] result =  new int[one.length + two.length];
        for(int i = 0; i < one.length; i++){
            result[j] = one[i];
            result[ j + 1 ] = two[i];
            j += 2;
        }
        return result;
    }

    public static int[] mixArrays(int[] one, int[] two) {
        int[] result =  new int[one.length + two.length];
        int j = 0;
        for(int i = 0; i < result.length; i++) {
            if(i % 2 == 0) {
                result[i] = one[j];
            } else {
                result[i] = two[j];
                j++;
            }
        }
        return result;
    }
}
