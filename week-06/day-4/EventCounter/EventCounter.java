import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Anna812 on 11/24/2016.
 */
public class EventCounter extends JFrame {

    private JPanel panel;
    private JLabel keyEC, mouseEC, windowEC;        //EC = Event Counter
    private JTextField textField;
    private int keyPressed, keyReleased, mouseClick, windowActive, windowDeactive, windowIcon, windowDeicon;

    public EventCounter() {
        setTitle("Event Counter Magic Box");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(350, 150);

        panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(boxLayout);
        add(panel);

        countKeys();
        countMouse();
        countWindow();
    }

    public void countKeys() {
        textField = new JTextField(15);
        ListenForKeys lForKeys = new ListenForKeys();
        textField.addKeyListener(lForKeys);

        keyEC = new JLabel("Pressed: ");

        panel.add(textField);
        panel.add(keyEC);
    }

    public void countMouse() {
        ListenForMouse lForMouse = new ListenForMouse();
        this.addMouseListener(lForMouse);

        mouseEC = new JLabel("Mouse clicked: ");
        panel.add(mouseEC);
    }

    private void countWindow() {
        ListenForWindow lForWindow = new ListenForWindow();
        this.addWindowListener(lForWindow);

        windowEC = new JLabel();
        panel.add(windowEC);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventCounter();
            }
        });
    }

    private class ListenForKeys implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {
            keyEC.setText("Pressed: " + e.getKeyChar() + " " + keyPressed + " times and released: " + keyReleased + "" +
                    " " + "times");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            keyPressed++;
        }

        @Override
        public void keyReleased(KeyEvent e) {
            keyReleased++;
        }
    }

    private class ListenForMouse implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            mouseClick++;
            mouseEC.setText("Mouse clicked: " + mouseClick + " times");
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    private class ListenForWindow implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            textField.setText("Window has been opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
        }

        @Override
        public void windowClosed(WindowEvent e) {
        }

        @Override
        public void windowIconified(WindowEvent e) {
            windowIcon++;
            updateWindowEC();
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            windowDeicon++;
            updateWindowEC();
        }

        @Override
        public void windowActivated(WindowEvent e) {
            windowActive++;
            updateWindowEC();
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            windowDeactive++;
            updateWindowEC();
        }
    }

    private void updateWindowEC() {
        windowEC.setText("<html>Window was active: " + windowActive + " times<br>"
                + "was deactivated: " + windowDeactive + " times<br>"
                + "was iconified: " + windowIcon + " times<br>"
                + "was deiconified: " + windowDeicon + " times</html>");
    }
}
