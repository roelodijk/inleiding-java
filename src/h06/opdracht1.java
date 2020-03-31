package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {


    int uitkomst;


    public void init() {

        setSize(1000,1000);

        uitkomst = 113 / 4;

    }

    public void paint(Graphics g) {

        g.drawString("aantal euro", 500, 450);
        g.drawString("Jan: " + uitkomst, 500,500);
        g.drawString("Ali: " + uitkomst, 500, 550);
        g.drawString("Jeanette: " + uitkomst, 500, 600);
        g.drawString("Roel: " + uitkomst, 500, 650);


    }
}

