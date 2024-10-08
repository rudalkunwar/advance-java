import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdapterDemo {
    JFrame f;
    JButton btn;
    JLabel lbl;

    public AdapterDemo() {
        // Initialize components
        f = new JFrame("Adapter Demo");
        btn = new JButton("Click");
        lbl = new JLabel("");

        // Set component bounds
        lbl.setBounds(100, 100, 150, 20);
        btn.setBounds(100, 130, 150, 20);

        // Add components to the frame
        f.add(lbl);
        f.add(btn);

        // Add action listener to the button
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Button clicked");
            }
        });

        // Add mouse listener using MouseAdapter
        btn.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lbl.setText("Mouse pressed");
            }
        });

        // Frame settings
        f.setSize(500, 400);
        f.setLayout(null); // Set layout to null to manually position components
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AdapterDemo();
    }
}
