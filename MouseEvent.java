import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventDemo implements MouseListener {
        
    JFrame f = new JFrame();
    JTextField f1 = new JTextField(30);
    JTextField f2 = new JTextField(30);
    JTextField f3 = new JTextField(30);
    
    MouseEventDemo() {
        // Set bounds for the text fields
        f1.setBounds(100, 100, 100, 20);
        f2.setBounds(100, 150, 100, 20);
        f3.setBounds(100, 200, 100, 20);
        
        // Add text fields to the frame
        f.add(f1);
        f.add(f2);
        f.add(f3);

        // Register the mouse listener with the frame
        f.addMouseListener(this);

        // Set frame properties
        f.setLayout(null); // Set layout to null to use absolute positioning
        f.setSize(600, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        // Not used in this example
    }

    public void mousePressed(MouseEvent e) {
        try {
            // Read numbers from the first two text fields
            int num1 = Integer.parseInt(f1.getText());
            int num2 = Integer.parseInt(f2.getText());
            int sum = num1 + num2;

            // Display the sum in the third text field
            f3.setText(Integer.toString(sum));
        } catch (NumberFormatException ex) {
            f3.setText("Invalid Input");
        }
    }

    public void mouseReleased(MouseEvent e) {
        try {
            // Read numbers from the first two text fields
            int num1 = Integer.parseInt(f1.getText());
            int num2 = Integer.parseInt(f2.getText());
            int dif = num1 - num2;

            // Display the difference in the third text field
            f3.setText(Integer.toString(dif));
        } catch (NumberFormatException ex) {
            f3.setText("Invalid Input");
        }
    }

    public void mouseEntered(MouseEvent e) {
        // Not used in this example
    }

    public void mouseExited(MouseEvent e) {
        // Not used in this example
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
