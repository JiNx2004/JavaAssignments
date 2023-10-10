package Week9;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3 {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Swing Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu
        JMenu fileMenu = new JMenu("File");

        // Create JMenuItems for the File menu
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        // Add ActionListeners to the File menu items
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Open File selected.");
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Save File selected.");
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add File menu items to the File menu
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator(); // Add a separator line
        fileMenu.add(exitMenuItem);

        // Add the File menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}

