package h06;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht extends Applet {

    int a, b, c;
    double uitkomst;

    public void init() {

        setSize(500, 500);

        // BEREKENING
        a = 59;
        b = 63;
        c = 69;
        uitkomst = (a + b +c) /10 /3;

    }

    public void paint(Graphics g) {

        g.drawString("het gemiddelde is: " + uitkomst, 210, 250);

    }
}
