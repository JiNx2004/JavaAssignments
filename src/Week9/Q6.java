package Week9;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Q6 extends Applet {
    public void paint(Graphics g) {
        // Draw an oval (ellipse) filled with blue color
        g.setColor(Color.blue);
        g.fillOval(50, 50, 100, 80);

        // Draw a rectangle filled with green color
        g.setColor(Color.green);
        g.fillRect(200, 50, 100, 80);

        // Draw a line
        g.setColor(Color.red);
        g.drawLine(20, 150, 330, 150);
    }
}

