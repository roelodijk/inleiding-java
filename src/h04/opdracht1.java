package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

    public void init() {

        setSize(1000,1000);

    }

    public void paint(Graphics g) {

        g.drawLine(400,500,600,500);
        g.drawLine(400,500,500,300);
        g.drawLine(600,500,500,300);

    }
}
