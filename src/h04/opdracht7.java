package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht7 extends Applet {


    public void init() {

        setSize(1000,1000);
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {

        // Het vierkant
        g.setColor(Color.white);

        g.fillRect(250, 250, 250, 250);
        // De stippen
        g.setColor(Color.black);
        g.fillOval(300,300,50,50);
        g.fillOval(400,300,50,50);
        g.fillOval(300, 400,50,50);
        g.fillOval(400,400,50,50);

    }
}
