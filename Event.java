import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDemo implements ActionListener {
    JButton btn1, btn2;
    JLabel l;
    JTextField t;

    EventDemo() {
        JFrame f = new JFrame("Event Handling");
        l = new JLabel("Count");
        t = new JTextField(5);
        t.setText("0"); // Initial count value

        btn1 = new JButton("+");
        btn2 = new JButton("-");

        f.add(l);
        f.add(t);
        f.add(btn1);
        f.add(btn2);

        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Parse the current count from the text field
        int count;
        count = Integer.parseInt(t.getText());

        // Update the count based on the button clicked
        if (e.getSource() == btn1) {
            count++;
        } else if (e.getSource() == btn2) {
            count--;
        }

        // Set the updated count back to the text field
        t.setText(Integer.toString(count));
    }

    public static void main(String[] args) {
        new EventDemo();
    }
}
