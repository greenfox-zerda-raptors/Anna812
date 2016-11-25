import javax.swing.*;
import java.awt.*;

/**
 * Created by Anna812 on 11/24/2016.
 */
public class ImageApp extends JPanel {

    private final Image image;

    public ImageApp() {
        image = Toolkit.getDefaultToolkit().createImage("hamster.jpg");

        JFrame frame = new JFrame();
        frame.setTitle("My Image App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.add(this);

    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();
        graphics.drawImage(image, 0, 0, this);
        // Draw your image
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageApp();
            }
        });
    }
}