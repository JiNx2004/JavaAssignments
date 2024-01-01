package Week9;

import javax.swing.*;
public class Q3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Menu");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 300);

        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        open.addActionListener(e -> JOptionPane.showMessageDialog(f, "Open File selected."));
        save.addActionListener(e -> JOptionPane.showMessageDialog(f, "Save File selected."));
        exit.addActionListener(e -> System.exit(0));

        m.add(open);
        m.add(save);
        m.addSeparator();
        m.add(exit);

        mb.add(m);
        f.setJMenuBar(mb);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
