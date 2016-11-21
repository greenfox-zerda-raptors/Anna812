import java.util.ArrayList;

/**
 * Created by Anna812 on 11/21/2016.
 */
public class Apple {

    public String getApple() {
        return "apple";
    }

    public int sumApples(ArrayList<Integer> al) {
        int i = 0;
        for (int temp : al) {
            i += temp;
        }
        return i;
    }
}
