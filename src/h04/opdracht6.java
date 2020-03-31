package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht6 extends Applet {

    public void init() {

        setSize(1000,1000);

    }

    public void paint(Graphics g) {

        // De paal zelf
        g.setColor(Color.gray);
        g.fillRect(200,200, 40, 500);
        // Kast waar de lichten aan zitten
        g.setColor(Color.black);
        g.fillRect(180, 200, 80, 200);
        // Rood licht
        g.setColor(Color.red);
        g.fillOval(200, 210, 40,40);
        // Oranje licht
        g.setColor(Color.orange);
        g.fillOval(200,270,40,40);
        // Groen licht
        g.setColor(Color.green);
        g.fillOval(200,330,40,40);
    }
}
