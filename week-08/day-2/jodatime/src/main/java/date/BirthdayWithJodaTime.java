package date;

import org.joda.time.Instant;
import org.joda.time.LocalDate;

import java.util.Scanner;

/**
 * Created by kicsen on 2016. 11. 30..
 */
public class BirthdayWithJodaTime implements BirthdayCalculator<LocalDate> {

    @Override
    public LocalDate parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        if(str != null) {
            LocalDate result = new LocalDate(str);
            return result;
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public String printMonthAndDay(LocalDate date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        return date.getMonthOfYear() + ". " + date.getDayOfMonth() + ".";
    }

    @Override
    public boolean isAnniversaryToday(LocalDate date) {
        // TODO - return with true if today is the same month+day as date
        return printMonthAndDay(date).equals(printMonthAndDay(new LocalDate()));
    }

    @Override
    public int calculateAgeInYears(LocalDate birthday) {
        // TODO - return how many years age the input date 'birthday' was
        LocalDate today = new LocalDate();
        int age = today.getYear() - birthday.getYear();
        if(today.getMonthOfYear() > birthday.getMonthOfYear()) {
            return age;
        } else if(today.getMonthOfYear() == birthday.getMonthOfYear()){
            if (today.getDayOfMonth() >= birthday.getDayOfMonth()) {
                return age;
            }
        }
        return age - 1;
    }

    @Override
    public int calculateDaysToNextAnniversary(LocalDate birthday) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        LocalDate today = new LocalDate();
        int birthdayDay = birthday.getDayOfYear();
        int todayDay = today.getDayOfYear();
        if(todayDay <= birthdayDay) {
            return birthdayDay - todayDay;
        }
        return 365 - (todayDay - birthdayDay);
    }

    public static void main(String[] args) {
        new BirthdayWithJodaTime().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        LocalDate birthdayDate = parseDate(birthdayStr);
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
