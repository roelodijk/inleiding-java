package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {

    public void init() {

        setSize(1000,1000);

    }

    public void paint(Graphics g) {

        // achtergrond
        setBackground(Color.orange);
        // rode deel van de vlag
        g.setColor(Color.red);
        g.fillRect(200,200,600,100);
        // witte deel van de vlag
        g.setColor(Color.white);
        g.fillRect(200,300,600,100);
        // blauwe deel van de vlag
        g.setColor(Color.blue);
        g.fillRect(200,400,600,100);
        // de mast
        g.setColor(Color.black);
        g.fillRect(180,200,20,600);
        g.fillOval(180,180,20,20);
    }
}
