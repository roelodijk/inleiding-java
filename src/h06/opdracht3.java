package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {

    int a, b;
    double uitkomst;

    public void init() {

        setSize(500,500);

        // BEREKENING
        a = 1897687;
        b = 2643354;
        uitkomst = a + b;


    }

    public void paint(Graphics g) {

        g.drawString("de uitkomst:  " + uitkomst, 250, 250);


    }
}
