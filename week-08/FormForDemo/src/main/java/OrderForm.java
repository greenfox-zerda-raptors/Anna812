import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Anna on 16/12/15.
 */
public class OrderForm extends JPanel implements ActionListener {

    private ArrayList<JLabel> labels;
    private ArrayList<TextField> textFields;

    public OrderForm() {
        JFrame frame = new JFrame();
        frame.setTitle("Order Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 150);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(this);
        frame.pack();
        createFormLayout();
    }

    private void createFormLayout() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        e.getSource();
    }
}
