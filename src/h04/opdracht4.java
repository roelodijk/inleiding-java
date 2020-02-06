package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {

    String voornaam;
    String getal;

    public void init() {

        voornaam = "Valerie";
        voornaam = "Jeroen";
        voornaam = "Hans";
        getal = "20";
        getal = "40";
        getal = "60";
        getal = "80";
        getal = "100";
        setSize(1000,1000);

    }

    public void paint(Graphics g) {

        // Valerie
        g.setColor(Color.black);
        g.drawString(voornaam = "Valerie", 205, 820);
        g.setColor(Color.magenta);
        g.fillRect(200,500,50,300);

        // Jeroen
        g.setColor(Color.black);
        g.drawString(voornaam = "Jeroen", 405, 820);
        g.setColor(Color.blue);
        g.fillRect(400,100,50,700);

        // Hans
        g.setColor(Color.black);
        g.drawString(voornaam= "Hans",605, 820);
        g.setColor(Color.red);
        g.fillRect(600,250,50,550);

        // tabel
        g.setColor(Color.black);
        g.drawLine(130,100, 130, 900);
        g.drawLine(130,900, 900,900);

        // verdeling getallen/namen
        g.drawString(getal= "0", 110, 900);
        g.drawString(getal= "20", 110, 680);
        g.drawString(getal= "40",110, 510);
        g.drawString(getal= "60", 110, 375);
        g.drawString(getal= "80", 110, 260);
        g.drawString(getal= "100", 100, 110);
        g.drawString(voornaam= "naam", 910, 900);
        g.drawString(voornaam= "gewicht (KG)", 130, 90);

    }
}
