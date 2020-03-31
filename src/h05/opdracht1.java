package h05;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

    String vorm;

    // DECLARATIE
    int breedte;
    int hoogte;
    Color opvulkleur;
    Color lijnkleur;

    public void init() {

        setSize(1000, 1000);
        //INITIALISATIE
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;

    }

    public void paint(Graphics g) {

        // LIJN

        g.drawLine(100, 100, 300, 100);
        g.drawString(vorm = "lijn", 200,115);

        // RECHTHOEK

        g.drawRect(100, 300, breedte, hoogte);
        g.drawString(vorm ="rechthoek", 175, 415);

        // GEVULDE RECHTHOEK MET OVAAL

        g.setColor(Color.magenta);
        g.fillRect(400,300,breedte,hoogte);
        g.setColor(Color.black);
        g.drawOval(400,300,breedte,hoogte);
        g.drawString(vorm ="rechthoek met ovaal", 450,415);

        // TAARTPUNT MET OVAAL ER OMHEEN

        g.drawOval(700,300,breedte,hoogte);
        g.setColor(Color.magenta);
        g.fillArc(700, 300,breedte,hoogte,360,50);
        g.setColor(Color.black);
        g.drawString(vorm = "taartpunt met ovaal eromheen",730,415);

        // AFGERONDE RECHTHOEK

        g.drawRoundRect(100, 600, breedte,hoogte,45,45);
        g.drawString(vorm = "afgeronde rechthoek", 140, 715);

        // GEVULDE OVAAL

        g.setColor(Color.magenta);
        g.fillOval(400,600,breedte,hoogte);
        g.setColor(Color.black);
        g.drawString(vorm = "gevulde ovaal", 460,715);

        // CIRKEL

        g.drawOval(700,600,150,150);
        g.drawString(vorm = "cirkel",760,765);

    }

}
