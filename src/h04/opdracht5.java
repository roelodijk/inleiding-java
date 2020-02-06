package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht5 extends Applet {

    public void init() {

        setSize(1000,1000);
        setBackground(Color.blue);

    }

    public void paint(Graphics g) {

        g.drawOval(250,250,500,500);
        g.setColor(Color.yellow);
        g.fillArc(250,250,500, 500, 90, 75);

    }
}