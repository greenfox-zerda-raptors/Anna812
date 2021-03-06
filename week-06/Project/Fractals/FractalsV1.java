import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by Anna812 on 11/25/2016.
 */
public class FractalsV1 extends JPanel {

    private Point2D p1, p2, p3;
    private int x1, x2, x3, y1, y2, y3;
    private int depth = 10;
    private Dimension dim;

    public FractalsV1() {
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        frame.setTitle("My Image App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int x = (int) (dim.getWidth() - 60);
        frame.setSize(x, (int)(dim.getHeight()));
        frame.setVisible(true);
        frame.add(this);
        getCoordinates();
    }

    public void getCoordinates() {
        p1 = new Point2D.Double(dim.getWidth()/2, 0);
        p2 = new Point2D.Double(0, dim.getHeight() - 50);
        p3 = new Point2D.Double(dim.getWidth() - 80, dim.getHeight() - 50);

        x1 = (int)p1.getX();
        y1 = (int)p1.getY();
        x2 = (int)p2.getX();
        y2 = (int)p2.getY();
        x3 = (int)p3.getX();
        y3 = (int)p3.getY();
    }

    @Override
    public void paint (Graphics g) {

        for(int i = 0; i < depth; i++) {
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x2, y2, x3, y3);
            g.drawLine(x3, y3, x1, y1);

            p1.setLocation((double)(x1 + x2)/2, (double)((y1 + y2)/2));
            p2.setLocation((double)(x2 + x3)/2, (double)((y2 + y3)/2));
            p3.setLocation((double)(x3 + x1)/2, (double)((y3 + y1)/2));

            x1 = (int)p1.getX();
            y1 = (int)p1.getY();
            x2 = (int)p2.getX();
            y2 = (int)p2.getY();
            x3 = (int)p3.getX();
            y3 = (int)p3.getY();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FractalsV1();
            }
        });
    }
}
