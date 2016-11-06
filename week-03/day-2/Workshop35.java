/**
 * Created by PHAZEK on 11/3/2016.
 */
public class Workshop35 {
    public static void main(String[] args) {
        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567

        String s = "*******";
        for (int x = 0; x < 7; x++){
            s = s.substring(0,x) + (x+1) + s.substring(x+1);
            System.out.println(s);
        }

//        for( int i = 1; i <= 7; i++){
//
//            for(int j = 1; j <= i; j++){
//                System.out.print(j);
//            }
//
//            for(int k=1; k <= 7-i; k++)
//                System.out.print("*");
//
//            System.out.println();
//        }


//        int y = 0;
//        String str = "*******";
//        do {
//            str = str.substring(0,y) + (y+1) + str.substring(y+1);
//            System.out.println (str);
//            y++;
//        } while (y < 7);
    }
}


