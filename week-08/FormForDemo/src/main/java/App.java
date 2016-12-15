import javax.swing.*;

/**
 * Created by Anna on 16/12/15.
 */
public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OrderForm();
            }
        });
    }
}
