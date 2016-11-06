import sun.java2d.pipe.AAShapePipe;

import java.util.Arrays;


/**
 * Created by PHAZEK on 11/4/2016.
 */
public class Workshop08 {
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        // Task 2: Print this two dimensional array to the output

//        int [][] twoArray = new int [4][4];
//        for (int i = 0; i < twoArray.length; i++) {
//            for (int j = 0; j < twoArray[i].length; j++) {
//                if (i == j) {
//                    twoArray[i][j] = 1;
//                } else {
//                    twoArray[i][j] = 0;
//                }
//            }
//        }

//        for (int i = 0; i < twoArray.length; i++) {
//            for (int j = 0; j < twoArray[i].length; j++) {
//                System.out.print(twoArray[i][j] + " ");
//            }
//            System.out.println();
//        }

        int [][] twoArray = new int [4][4];
        for (int i = 0; i < twoArray.length; i++) {
            twoArray[i][i] = 1;
        }

        for (int[] row : twoArray) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}