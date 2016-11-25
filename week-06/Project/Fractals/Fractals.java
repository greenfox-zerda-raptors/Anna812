import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by Anna812 on 11/25/2016.
 */
public class Fractals extends JPanel {

    private Point2D p1, p2, p3, p4, p5, p6;
    private int depth = 3;
    private Dimension dim;

    public Fractals() {
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
//        p4 = new Point2D.Double(((p1.getX()+p2.getX())/2), ((p1.getY()+p2.getY())/2));
//        p5 = new Point2D.Double(((p2.getX()+p3.getX())/2), ((p2.getY()+p3.getY())/2));
//        p6 = new Point2D.Double(((p3.getX()+p1.getX())/2), ((p3.getY()+p1.getY())/2));
//        p1.setLocation(((p1.getX()+p2.getX())/2), ((p1.getY()+p2.getY())/2));
//        p2.setLocation(((p2.getX()+p3.getX())/2), ((p2.getY()+p3.getY())/2));
//        p3.setLocation(((p3.getX()+p1.getX())/2), ((p3.getY()+p1.getY())/2));
    }

    public void drawFractals() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int i = 0; i < depth; i++) {
            g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY());
            g.drawLine((int)p2.getX(), (int)p2.getY(), (int)p3.getX(), (int)p3.getY());
            g.drawLine((int)p3.getX(), (int)p3.getY(), (int)p1.getX(), (int)p1.getY());
            p1.setLocation(((p1.getX()+p2.getX())/2), ((p1.getY()+p2.getY())/2));
            p2.setLocation(((p2.getX()+p3.getX())/2), ((p2.getY()+p3.getY())/2));
            p3.setLocation(((p3.getX()+p1.getX())/2), ((p3.getY()+p1.getY())/2));
        }

//        g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY());
//        g.drawLine((int)p2.getX(), (int)p2.getY(), (int)p3.getX(), (int)p3.getY());
//        g.drawLine((int)p3.getX(), (int)p3.getY(), (int)p1.getX(), (int)p1.getY());
//        g.drawLine((int)p4.getX(), (int)p4.getY(), (int)p5.getX(), (int)p5.getY());
//        g.drawLine((int)p5.getX(), (int)p5.getY(), (int)p6.getX(), (int)p6.getY());
//        g.drawLine((int)p6.getX(), (int)p6.getY(), (int)p4.getX(), (int)p4.getY());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Fractals();
            }
        });
    }
}
