import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by Anna812 on 11/25/2016.
 */
public class FractalsV3 extends JPanel{

    private int counter = 0;
    private Dimension dim;

    public FractalsV3() {
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        frame.setTitle("My Image App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int x = (int) (dim.getWidth() - 60);
        frame.setSize(x, (int)(dim.getHeight()));
        frame.setVisible(true);
        frame.add(this);
    }

    public void drawFractals(Graphics graphics, int depth, Point2D p1, Point2D p2, Point2D p3) {
        if(depth <= 0) {
            return;
        }
            int x1 = (int) p1.getX();
            int y1 = (int) p1.getY();
            int x2 = (int) p2.getX();
            int y2 = (int) p2.getY();
            int x3 = (int) p3.getX();
            int y3 = (int) p3.getY();

            Point2D p4 = new Point2D.Double((double) (x1 + x2) / 2, (double) (y1 + y2) / 2);
            Point2D p5 = new Point2D.Double((double) (x2 + x3) / 2, (double) (y2 + y3) / 2);
            Point2D p6 = new Point2D.Double((double) (x3 + x1) / 2, (double) (y3 + y1) / 2);

            int x4 = (int) p4.getX();
            int y4 = (int) p4.getY();
            int x5 = (int) p5.getX();
            int y5 = (int) p5.getY();
            int x6 = (int) p6.getX();
            int y6 = (int) p6.getY();

            graphics.drawLine(x4, y4, x5, y5);
            graphics.drawLine(x5, y5, x6, y6);
            graphics.drawLine(x6, y6, x4, y4);

            drawFractals(graphics, depth - 1, p1, p4, p6);
            drawFractals(graphics, depth - 1, p2, p4, p5);
            drawFractals(graphics, depth - 1, p3, p5, p6);
}

    public void paintComponent (Graphics g) {
        Point2D p1 = new Point2D.Double(dim.getWidth()/2, 0);
        Point2D p2 = new Point2D.Double(0, dim.getHeight() - 50);
        Point2D p3 = new Point2D.Double(dim.getWidth() - 80, dim.getHeight() - 50);

        int x1 = (int) p1.getX();
        int y1 = (int) p1.getY();
        int x2 = (int) p2.getX();
        int y2 = (int) p2.getY();
        int x3 = (int) p3.getX();
        int y3 = (int) p3.getY();

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);

        drawFractals(g, 8, p1, p2, p3);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FractalsV3();
            }
        });
    }
}
