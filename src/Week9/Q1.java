package Week9;
import javax.swing.*;

public class Q1 extends JFrame {

    public Q1() {
        // Set the title of the JFrame
        setTitle("Swing Inheritance");

        // Create a JLabel to display the message
        JLabel label = new JLabel(" Hello This is Swing");

        // Add the label to the JFrame
        add(label);

        // Set the size of the JFrame
        setSize(300, 100);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create an instance of our custom JFrame subclass
        Q1 frame = new Q1();

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
