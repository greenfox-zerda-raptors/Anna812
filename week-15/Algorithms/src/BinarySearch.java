/**
 * Created by Anna on 17/02/07.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        try {
            int result = binarySearch(list, 2);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int binarySearch(int[] list, int key) throws Exception {
        int lowest = 0;
        int highest = list.length - 1;
        while(lowest<=highest) {
            int middle = lowest + (highest - lowest) / 2;
            if (key < list[middle]) {
                highest = middle - 1;
            } else if (key > list[middle]) {
                lowest = middle + 1;
            } else {
                return middle + 1;
            }
        }
        throw new Exception("The list does not contain given number");
    }
}
