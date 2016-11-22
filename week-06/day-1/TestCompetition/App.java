/**
 * Created by Anna812 on 11/21/2016.
 */
public class App {

    public static void main(String[] args) {

        WordToolbox w = new WordToolbox ("cat");
        String [] alternatives = {"act", "latest", "foetal","aloft","float","flota"};

        for (String s : alternatives) {
            System.out.printf("is %s an anagram of %s = %s\n", s, w.getS(), w.isAnAnagram(s));
        }

        System.out.println("\nNew test");
        w.setS("aloft");
        for (String s : alternatives) {
            System.out.printf("is %s an anagram of %s = %s\n", s, w.getS(), w.isAnAnagram(s));
        }
    }
}
