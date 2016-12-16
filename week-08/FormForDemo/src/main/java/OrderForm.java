import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by Anna on 16/12/15.
 */
public class OrderForm extends JPanel {

    private JTextField nameTextField, emailTextField, cityTextField, postalCodeTextField, streetTextField;
    private JComboBox orderedItemCombo;
    private JRadioButton cash;
    private JTextArea feedbackMessage;
    private int counter = 1;

    public OrderForm() {
        JFrame frame = new JFrame();
        frame.setTitle("Order Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(380, 650);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.add(this);
        createFormLayout();
        createComboBox();
        createRadioButtons();
        createSubmitButton();
        createFeedBackTextArea();
    }

    private void createFormLayout() {
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBorder(new EmptyBorder(0,0,5,0));
        nameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        JLabel emailLabel = new JLabel("E-mail");
        emailLabel.setBorder(new EmptyBorder(5,0,5,0));
        JLabel cityLabel = new JLabel("City");
        cityLabel.setBorder(new EmptyBorder(5,0,5,0));
        JLabel postalCodeLabel = new JLabel("Postal Code");
        postalCodeLabel.setBorder(new EmptyBorder(5,0,5,0));
        JLabel streetLabel = new JLabel("Street");
        streetLabel.setBorder(new EmptyBorder(5,0,5,0));

        nameTextField = new JTextField(10);
        emailTextField = new JTextField(10);
        cityTextField = new JTextField(10);
        postalCodeTextField = new JTextField(10);
        streetTextField = new JTextField(10);

        add(nameLabel);
        add(nameTextField);
        add(emailLabel);
        add(emailTextField);
        add(cityLabel);
        add(cityTextField);
        add(postalCodeLabel);
        add(postalCodeTextField);
        add(streetLabel);
        add(streetTextField);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    private void createComboBox() {
        JLabel orderedItemLabel = new JLabel("Choose the item you want to order");
        orderedItemLabel.setBorder(new EmptyBorder(15,0,5,0));

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
        JLabel paymentMethodLabel = new JLabel("Choose payment method");
        paymentMethodLabel.setBorder(new EmptyBorder(10,0,5,0));

        cash = new JRadioButton("Cash");
        JRadioButton creditCard = new JRadioButton("Credit Card");
        ButtonGroup paymentMethodRadioButtons = new ButtonGroup();
        paymentMethodRadioButtons.add(cash);
        paymentMethodRadioButtons.add(creditCard);
        creditCard.setBorder(new EmptyBorder(4,4,20,0));

        add(paymentMethodLabel);
        add(cash);
        add(creditCard);
    }

    private void createSubmitButton() {
        JButton submit = new JButton("Submit");
        submit.addActionListener(
                new submitData());
        add(submit);
    }

    private void createFeedBackTextArea() {
        feedbackMessage = new JTextArea(8, 10);
        feedbackMessage.setBounds(5, 5, 300, 130);

        JScrollPane feedbackPane = new JScrollPane(feedbackMessage);
        feedbackPane.setAlignmentX(0);
        feedbackPane.setPreferredSize(new Dimension(320, 150));

        feedbackPane.add(feedbackMessage);
        add(feedbackPane);
    }

    private class submitData implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                exportData();
                feedbackMessage.setText(retrieveData());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            counter++;
        }
    }

    private void exportData() throws SQLException{
        ConnectionSource connectionSource = new JdbcConnectionSource("jdbc:mysql://localhost:3306/order_form?user=root&password=0000");

        TableUtils.createTableIfNotExists(connectionSource, Order.class);
        TableUtils.createTableIfNotExists(connectionSource, Customer.class);
        TableUtils.createTableIfNotExists(connectionSource, Address.class);

        Dao<Order, Integer> orderDao = DaoManager.createDao(connectionSource, Order.class);

        Address address = new Address(cityTextField.getText(), Integer.parseInt(postalCodeTextField.getText()),
                streetTextField.getText());
        Customer customer = new Customer(nameTextField.getText(), emailTextField.getText(), address);


        Order order;
        if(cash.isSelected()) {
            order = new Order(orderedItemCombo.getSelectedItem().toString(), "cash",
                    customer);
        } else {
            order = new Order(orderedItemCombo.getSelectedItem().toString(), "credit card",
                    customer);
        }
        orderDao.create(order);
    }

    private String retrieveData() throws SQLException{
        ConnectionSource connectionSource = new JdbcConnectionSource("jdbc:mysql://localhost:3306/order_form?user=root&password=0000");
        Dao<Order, Integer> orderDao = DaoManager.createDao(connectionSource, Order.class);
        Order orderRetrieved = orderDao.queryForId(counter);
        return orderRetrieved.toString();
    }
}
