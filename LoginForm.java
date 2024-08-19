import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
    public LoginForm() {
        JLabel l1, l2;
        JTextField t1;
        JPasswordField t2;  // Changed to JPasswordField
        JButton btn;

        l1 = new JLabel("Username: ");
        l2 = new JLabel("Password: ");
        t1 = new JTextField(30);
        t2 = new JPasswordField(30);  // Changed to JPasswordField

        btn = new JButton("Login");

        l1.setBounds(100, 100, 100, 20);
        l2.setBounds(100, 150, 100, 20);
        t1.setBounds(220, 100, 150, 20);  //nce Increased width for better appearance
        t2.setBounds(220, 150, 150, 20);  // Increased width for better appeara
        btn.setBounds(200, 200, 100, 30); // Slightly increased height for better button visibility

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(btn);

        setLayout(null);  // Ensures absolute positioning
        setVisible(true);
        setSize(500, 400);  // Reduced size to better fit the components
        setLocationRelativeTo(null);  // Centers the frame on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
