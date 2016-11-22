import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Anna812 on 11/21/2016.
 */
public class WordToolbox implements IWordToolbox{

    private String stringHeld;

    public WordToolbox(String stringHeld) {
        this.stringHeld = stringHeld;
    }

    @Override
    public void setS(String s) {
        stringHeld = s;
    }

    @Override
    public String getS() {
        return stringHeld;
    }

    private HashMap<Character, Integer> countAllLetters(String word) {

        WordToolbox wtb = new WordToolbox(word.toLowerCase());
        HashMap<Character, Integer> hm = new HashMap<>();
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l',
                'm','n','o','p','q','r','s','t','u','v','w','x','y','z'));

        for (char c : charList) {
            hm.put(c, wtb.countHowMany(c));
        }
        return hm;
    }

    public boolean isAnAnagram(String stringToCheck) {
        return countAllLetters(stringToCheck).equals(countAllLetters(stringHeld));
    }

    public int countHowMany(char charToFind) {

        char low = Character.toLowerCase(charToFind);
        int count = 0;

        for(int i = 0; i < stringHeld.length(); i++) {
            if(stringHeld.toLowerCase().charAt(i) == low ) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void WaitingItOut() {
    }
}
