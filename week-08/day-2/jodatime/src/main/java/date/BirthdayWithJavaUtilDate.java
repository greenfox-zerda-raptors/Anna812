package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    @Override
    public Date parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String printMonthAndDay(Date date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        SimpleDateFormat MMdd = new SimpleDateFormat("MM. dd.");
        String result = MMdd.format(date);
        return result;
    }

    @Override
    public boolean isAnniversaryToday(Date date) {
        // TODO - return with true if today is the same month+day as date
        Date today = new Date();
        return printMonthAndDay(today).equals(printMonthAndDay(date));
    }

    @Override
    public int calculateAgeInYears(Date birthday) {
        // TODO - return how many years age the input date 'birthday' was
        SimpleDateFormat yyyy = new SimpleDateFormat("yyyy");
        SimpleDateFormat MMdd = new SimpleDateFormat("MMdd");
        Date today = new Date();
        int todayYear = Integer.parseInt(yyyy.format(today));
        int birthdayYear = Integer.parseInt(yyyy.format(birthday));
        if(Integer.parseInt(MMdd.format(today)) >= Integer.parseInt(MMdd.format(birthday))) {
            return todayYear - birthdayYear;
        } else {
            return todayYear - birthdayYear - 1;
        }
    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)

        return -1;
    }

    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}
