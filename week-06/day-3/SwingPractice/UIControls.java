import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna812 on 11/23/2016.
 */
public class UIControls extends JFrame implements ActionListener {

    private JLabel input, memory;
    private JTextField textField;
    private JButton clear;

    public UIControls() {
        setTitle("UI Controls");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 150);
        setResizable(false);
        createControls();
        setVisible(true);
    }

    public void createControls() {
        JPanel panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        getContentPane().add(panel);

        textField = new JTextField();
//        textField.setMaximumSize(new Dimension(200, 20));
//        textField.setMinimumSize(new Dimension(100, 50));
        textField.requestFocus();
        textField.addActionListener(
                new overwriteInputLabel());

//        textField.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(textField);

        input = new JLabel("Text: ");
//        input.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(input);
        memory = new JLabel("Memory: ");
//        memory.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(memory);

        clear = new JButton("Clear memory");
        clear.addActionListener(
                new clearMemory());
//        clear.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(clear);
    }

    private class overwriteInputLabel implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(input.getText() != null){
                String[] temp = input.getText().split(":");
                memory.setText("Memory:" + temp[1]);
            }
            input.setText("Text: " + textField.getText());
        }
    }

    private class clearMemory implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            memory.setText("Memory: ");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UIControls();
            }
        });
    }
}
