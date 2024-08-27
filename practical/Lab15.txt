import javax.swing.*;

public class JavaComponent {

    public static void main(String[] args) {
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

        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("Subscribe to newsletter");
        checkBox.setBounds(100, 80, 200, 30); // Set position and size
        panel.add(checkBox);

        // Create a radio button (Male)
        JRadioButton radioButtonMale = new JRadioButton("Male");
        radioButtonMale.setBounds(100, 130, 100, 30); // Set position and size
        panel.add(radioButtonMale);

        // Create a radio button (Female)
        JRadioButton radioButtonFemale = new JRadioButton("Female");
        radioButtonFemale.setBounds(200, 130, 100, 30); // Set position and size
        panel.add(radioButtonFemale);

        // Group the radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioButtonMale);
        genderGroup.add(radioButtonFemale);

        // Set frame to be visible
        frame.setVisible(true);
    }
}
