package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    int uitkomst1;
    int uitkomst2;
    int uitkomst3;

    public void init() {

        setSize(1000, 1000);

        // BEREKENINGEN
        uitkomst1 = 60*60;
        uitkomst2 = 60*60*24;
        uitkomst3 = 60*60*24*365;

    }


    public void paint(Graphics g) {

        g.drawString("aantal seconden in een uur: " + uitkomst1, 450, 500);
        g.drawString("aantal seconden in een dag: " + uitkomst2, 450, 550);
        g.drawString("aantal seconden in een jaar: " + uitkomst3, 450, 600);
        
    }
}
