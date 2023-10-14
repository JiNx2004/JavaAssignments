package Week9;
import javax.swing.*;
import java.awt.*;

public class Q4 extends JFrame {
    private JTextField firstName = new JTextField(10);
    private JTextField lastName = new JTextField(10);
    private JComboBox<String> gender = new JComboBox<>(new String[]{"Male", "Female", "Other"});
    private JTextField studentId = new JTextField(10);
    private JButton register = new JButton("Register");

    public Q4() {
        setTitle("Student Registration Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        register.addActionListener(e -> {
            String fName = firstName.getText();
            String lName = lastName.getText();
            String selectedGender = (String) gender.getSelectedItem();
            String id = studentId.getText();

            String message = "Student registered:\nFirst Name: " + fName + "\nLast Name: " + lName
                    + "\nGender: " + selectedGender + "\nStudent ID: " + id;

            JOptionPane.showMessageDialog(this, message, "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
        });

        addFields(panel,
            new JLabel("First Name:"), firstName,
            new JLabel("Last Name:"), lastName,
            new JLabel("Gender:"), gender,
            new JLabel("Student ID:"), studentId);

        panel.add(new JLabel());
        panel.add(register);

        add(panel);
    }

    private void addFields(JPanel panel, Component... components) {
        for (Component component : components) {
            panel.add(component);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q4().setVisible(true));
    }
}
