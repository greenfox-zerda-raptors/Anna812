import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * Created by Anna812 on 11/10/2016.
 */

public class Horoscope {

    static Scanner userInput = new Scanner(System.in);

    static String intro = "Now you may find it inconceivable or at the very least a bit unlikely\n" +
            "that the relative position of the planets and the stars could have\n" +
            "a special deep significance or meaning that exclusively applies to only you,\n" +
            "but let me give you my assurance that these forecasts and predictions\n" +
            "are all based on solid, scientific, documented evidence, so you would have\n" +
            "to be some kind of moron not to realize that every single one of them is absolutely true.\n";

    static ArrayList<String> zodiac = new ArrayList<>(Arrays.asList("Aquarius", "Pisces", "Aries", "Taurus",
            "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn"));

    static ArrayList<String> bsArray = new ArrayList<>();

    public static void main(String[] args) {
        loadDestiny();
        String prompt = "What is your sign? (or type exit to quit)";
        System.out.println(intro + "\n" + prompt);
        while (userInput.hasNext()) {
            String sign = userInput.next();
            if (sign.equalsIgnoreCase("exit")) {
                System.out.println("May the odds ever be in your favour!");
                break;
            } else {
                try {
                    checkIfValid(sign);
                    pickingDestiny();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(prompt);
        }
    }

    public static void checkIfValid(String sign) throws Exception {
        if (!zodiac.contains(sign)) {
            throw new Exception("That is not a sign, my darling. Please try again.");
        }
    }

    public static void loadDestiny() {
        try {
            FileReader inputFile = new FileReader("source.txt");
            BufferedReader bufferReader = new BufferedReader(inputFile);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                bsArray.add(line);
            }
            bufferReader.close();
        } catch(Exception e) {
            System.out.println("Error while reading file line by line:" + e.getMessage());
        }
    }

    public static void pickingDestiny () {
        Random r = new Random();
        int i = r.nextInt(bsArray.size());
        System.out.println(bsArray.get(i));
    }
}