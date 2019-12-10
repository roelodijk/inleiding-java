package H02;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    String roepnaam;
    String achternaam;

    public void init() {

        roepnaam = "Roel";
        achternaam = "Odijk";
        setSize(500,500);
        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {

        g.setColor(Color.blue);
        g.drawString(roepnaam, 250,250);
        g.setColor(Color.RED);
        g.drawString(achternaam,250,260);
    }
}
