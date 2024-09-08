import javax.swing.*;

public class JavaComponent {

    public JavaComponent() {
        // Create the main frame
        JFrame frame = new JFrame("Swing Components Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Disable layout manager

        // Create a panel
        JPanel panel = new JPanel();
        panel.setBounds(20, 20, 350, 320); // Set position and size
        panel.setLayout(null); // Disable layout manager for panel
        frame.add(panel);

        // Create a label
        JLabel label = new JLabel("Name:");
        label.setBounds(30, 30, 50, 30); // Set position and size
        panel.add(label);

        // Create a text field
        JTextField textField = new JTextField();
        textField.setBounds(100, 30, 200, 30); // Set position and size
        panel.add(textField);

        // Create a button
        JButton button = new JButton("Submit");
        button.setBounds(130, 250, 100, 30); // Set position and size
        panel.add(button);

        // Create checkboxes
        JCheckBox checkBox1 = new JCheckBox("Python");
        checkBox1.setBounds(100, 80, 200, 30); // Set position and size
        panel.add(checkBox1);

        JCheckBox checkBox2 = new JCheckBox("JavaScript");
        checkBox2.setBounds(100, 120, 200, 30); // Adjusted position to avoid overlap
        panel.add(checkBox2);

        JCheckBox checkBox3 = new JCheckBox("Java");
        checkBox3.setBounds(100, 160, 200, 30); // Adjusted position to avoid overlap
        panel.add(checkBox3);

        // Create radio buttons
        JRadioButton radioButtonMale = new JRadioButton("Male");
        radioButtonMale.setBounds(100, 200, 100, 30); // Set position and size
        panel.add(radioButtonMale);

        JRadioButton radioButtonFemale = new JRadioButton("Female");
        radioButtonFemale.setBounds(200, 200, 100, 30); // Set position and size
        panel.add(radioButtonFemale);

        // Group the radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioButtonMale);
        genderGroup.add(radioButtonFemale);

        // Set frame to be visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JavaComponent();
    }
}
