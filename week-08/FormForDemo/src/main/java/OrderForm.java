import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna on 16/12/15.
 */
public class OrderForm extends JPanel implements ActionListener {

    private JLabel nameLabel, emailLabel, addressLabel, cityLabel, postalCodeLabel, streetLabel, orderedItemLabel, paymentMethodLabel;
    JTextField nameTextField, emailTextField, cityTextField, postalCodeTextField, streetTextField;
    private JComboBox orderedItemCombo;
    ButtonGroup paymentMethodRadioButtons;
    JRadioButton cash, creditCard;
    private JButton submit;

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
        createComboBox();
        createRadioButtons();
        createSubmitButton();
    }

    private void createFormLayout() {
        nameLabel = new JLabel("Name");
        emailLabel = new JLabel("E-mail");
        addressLabel = new JLabel("Address");
        cityLabel = new JLabel("City");
        postalCodeLabel = new JLabel("Postal Code");
        streetLabel = new JLabel("Street");

        nameTextField = new JTextField(10);
        emailTextField = new JTextField(10);
        cityTextField = new JTextField(10);
        postalCodeTextField = new JTextField(10);
        streetTextField = new JTextField(10);

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

    private void createComboBox() {
        orderedItemLabel = new JLabel("Choose the item you want to order");

        DefaultComboBoxModel orderedItemName = new DefaultComboBoxModel();
        orderedItemName.addElement("");
        orderedItemName.addElement("Shoes");
        orderedItemName.addElement("Dog");
        orderedItemName.addElement("Food");
        orderedItemName.addElement("Stuff");
        orderedItemCombo = new JComboBox(orderedItemName);
        JScrollPane orderedItemScrollPane = new JScrollPane(orderedItemCombo);

        add(orderedItemLabel);
        add(orderedItemScrollPane);
    }

    private void createRadioButtons() {
        paymentMethodLabel = new JLabel("Choose payment method");

        cash = new JRadioButton("Cash");
        creditCard = new JRadioButton("Credit Card");
        paymentMethodRadioButtons = new ButtonGroup();
        paymentMethodRadioButtons.add(cash);
        paymentMethodRadioButtons.add(creditCard);

        add(paymentMethodLabel);
        add(cash);
        add(creditCard);
    }

    private void createSubmitButton() {
        submit = new JButton("Submit");
        add(submit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
            Customer customer = new Customer(null, nameTextField.getText(), emailTextField.getText());
            Address address = new Address(null, cityTextField.getText(), Integer.parseInt(postalCodeTextField.getText()),
                    streetTextField.getText());
            if(cash.isSelected()) {
                Order order = new Order(null, orderedItemCombo.getSelectedItem().toString(), "cash",
                        customer, address);
            } else {
                Order order = new Order(null, orderedItemCombo.getSelectedItem().toString(), "credit card",
                        customer, address);
            }
        }
    }
}
