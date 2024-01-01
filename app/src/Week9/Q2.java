package Week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a button
        JButton button = new JButton("Click Me!");

        // Create a label to display the message
        JLabel label = new JLabel("");

        // Create an ActionListener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code will run when the button is clicked
                label.setText("Button Clicked!");
            }
        });

        // Create a JPanel to hold the button and label
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(button);
        panel.add(label);

        // Add the panel to the frame
        frame.add(panel);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
