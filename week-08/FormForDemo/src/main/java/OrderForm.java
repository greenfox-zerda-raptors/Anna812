import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by Anna on 16/12/15.
 */
public class OrderForm extends JPanel {

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
        submit.addActionListener(
                new submitData());
        add(submit);
    }

    private class submitData implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                exportData();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    private void exportData() throws SQLException{
        ConnectionSource connectionSource = new JdbcConnectionSource("jdbc:mysql://localhost:3306/order_form?user=root&password=0000");

        TableUtils.createTableIfNotExists(connectionSource, Order.class);
        TableUtils.createTableIfNotExists(connectionSource, Customer.class);
        TableUtils.createTableIfNotExists(connectionSource, Address.class);

        Dao<Order, Integer> orderDao = DaoManager.createDao(connectionSource, Order.class);

        Customer customer = new Customer(nameTextField.getText(), emailTextField.getText());
        Address address = new Address(cityTextField.getText(), Integer.parseInt(postalCodeTextField.getText()),
                streetTextField.getText());

        Order order;
        if(cash.isSelected()) {
            order = new Order(orderedItemCombo.getSelectedItem().toString(), "cash",
                    customer, address);
        } else {
            order = new Order(orderedItemCombo.getSelectedItem().toString(), "credit card",
                    customer, address);
        }
        orderDao.create(order);
    }
}
