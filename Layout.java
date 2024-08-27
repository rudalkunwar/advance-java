import javax.swing.*;
import java.awt.*;

public class Layouts {
    JFrame f;
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2; // Use JPasswordField for password
    JButton btn;

    public Layouts() {
        // Initialize the frame
        f = new JFrame("Layouts");

        // Initialize components
        l1 = new JLabel("Username:");
        l2 = new JLabel("Password:");

        t1 = new JTextField(30);
        t2 = new JPasswordField(30);

        btn = new JButton("Submit");

        // Set layout and add components to the frame
        f.setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns with 10px gaps
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(btn);

        // Set frame properties
        f.setSize(300, 150);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Layouts();
    }
}
