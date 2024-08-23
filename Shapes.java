import javax.swing.*;
import java.awt.*;

public class ShapeDrawingFrame extends JFrame {

    // Constructor to set up the frame
    public ShapeDrawingFrame() {
        // Set the title of the frame
        super("Shape Drawing Example");

        // Set the size of the frame
        setSize(400, 400);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        // Cast to Graphics2D for more advanced control
        Graphics2D g2d = (Graphics2D) g;

        // Set the color to red and draw a rectangle
        g2d.setColor(Color.RED);
        g2d.drawRect(50, 50, 100, 60);

        // Set the color to blue and draw an oval
        g2d.setColor(Color.BLUE);
        g2d.drawOval(200, 50, 100, 60);

        // Set the color to green and draw a line
        g2d.setColor(Color.GREEN);
        g2d.drawLine(50, 150, 300, 150);

        // Set the color to orange and fill a rectangle
        g2d.setColor(Color.ORANGE);
        g2d.fillRect(50, 200, 100, 60);

        // Set the color to magenta and fill an oval
        g2d.setColor(Color.MAGENTA);
        g2d.fillOval(200, 200, 100, 60);
    }

    // Main method to create and display the frame
    public static void main(String[] args) {
        new ShapeDrawingFrame();
    }
}
