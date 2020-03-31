package h05;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    String naam;

    // DECLARATIE
    int Valerie;
    int Jeroen;
    int Hans;

    public void init() {

        setSize(1000,2000);
        // INITIALISATIE GEWICHT
        Valerie = 200;
        Jeroen = 500;
        Hans = 400;
    }


    public void paint(Graphics g) {

        // LEGENDA
        g.setColor(Color.magenta);
        g.drawString(naam = "Valerie (40kg)", 50, 90);
        g.setColor(Color.blue);
        g.drawString(naam = "Jeroen (100kg)", 50, 110);
        g.setColor(Color.red);
        g.drawString(naam = "Hans (80kg)", 50, 130);

        // VALERIE
        g.setColor(Color.black);
        g.drawString(naam = "Valerie", 205, 90);
        g.setColor(Color.magenta);
        g.fillRect(200, 100, 50, Valerie);

        // JEROEN
        g.setColor(Color.black);
        g.drawString(naam = "Jeroen", 355, 90);
        g.setColor(Color.blue);
        g.fillRect(350, 100, 50, Jeroen);

        // HANS
        g.setColor(Color.black);
        g.drawString(naam = "Hans", 508, 90);
        g.setColor(Color.red);
        g.fillRect(500, 100, 50, Hans);

        // TABEL
        g.setColor(Color.black);
        g.drawLine(150, 80, 150, 700);
        g.drawLine(150, 700, 700, 700);
    }
}
