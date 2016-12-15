import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

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
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(this);
        createFormLayout();
        createComboBoxes();
    }

    private void createFormLayout() {
        JLabel nameLabel = new JLabel("Name");
        JLabel emailLabel = new JLabel("E-mail");
        JLabel addressLabel = new JLabel("Address");
        JLabel cityLabel = new JLabel("City");
        JLabel postalCodeLabel = new JLabel("Postal Code");
        JLabel streetLabel = new JLabel("Street");

        JTextField nameTextField = new JTextField(10);
        JTextField emailTextField = new JTextField(10);
        JTextField cityTextField = new JTextField(10);
        JTextField postalCodeTextField = new JTextField(10);
        JTextField streetTextField = new JTextField(10);

        add(nameLabel);
        add(nameTextField);
        add(emailLabel);
        add(emailTextField);
        add(addressLabel);
        add(cityLabel);
        add(cityTextField);
        add(postalCodeLabel);
        add(postalCodeTextField);
        add(streetLabel);
        add(streetTextField);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        setFont(new Font(getName(), Font.PLAIN, 6));
    }

    private void createComboBoxes() {
        JLabel orderedItemLabel = new JLabel("Choose the item you want to order");
        JLabel paymentMethodLabel = new JLabel("Choose payment method");

        

        add(orderedItemLabel);
        add(paymentMethodLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        e.getSource();
    }
}
