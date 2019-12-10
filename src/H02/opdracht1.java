package H02;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

    // VARIABELEN DECLAREREN

    String voornaam;

    public void init() {

        // VARIABELEN INITIALISEREN

        voornaam = "Roel";
        setSize(500, 500);
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {

        // DINGEN IN BEELD BRENGEN

        g.setColor(Color.yellow);
        g.drawString(voornaam, 30,30);
    }
}

