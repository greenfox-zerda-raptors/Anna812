import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Anna812 on 11/11/2016.
 */

public class PlayWithDates {

//    static ArrayList<Date> date = new ArrayList<Date>(01.20, 02.19, 03.21, 04.20, 05.21, 06.21, 07.23, 08.23, 09.23,
//            10.23, 11.22, 12.22);

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Give the month and day of your birth:");
        while (userInput.hasNext()) {
            String a = userInput.next();
            System.out.println(signFinder(a));
        }

    }
    public static Date signFinder (String str) {
        Date inputDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.");
        try {
            inputDate = sdf.parse(str);
        } catch (ParseException e) {
        }
        return inputDate;
    }
}
