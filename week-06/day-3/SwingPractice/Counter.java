import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna812 on 11/23/2016.
 */
public class Counter extends JFrame{

    private JButton clickMe, reset;
    private JLabel label;
    private int clicks;

    public Counter() {
        setTitle("Counter App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(350, 100);
        createCounter();
    }

    private void createCounter() {
        JPanel panel = new JPanel();
        add(panel);

        clickMe = new JButton("Click me!");
        clickMe.addActionListener(
                new buttonCounter());
        panel.add(clickMe);

        reset = new JButton("Reset");
        reset.addActionListener(
                new buttonReset());
        panel.add(reset);

        label = new JLabel("Pressed: ");
        panel.add(label);
    }

    private void updateCounter() {
        label.setText("Pressed: " + clicks);
    }

    private class buttonCounter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            clicks ++;
            updateCounter();
        }
    }

    private class buttonReset implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks = 0;
            updateCounter();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Counter();
            }
        });
    }
}
