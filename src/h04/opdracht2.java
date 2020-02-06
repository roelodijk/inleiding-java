package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    public void init() {

        setSize(1000,1000);

    }

    public void paint(Graphics g) {

        // het geraamte
        g.drawRect(200,200,600,500);
        // de deur
        g.drawRect(400,600,50,100);
        // een rechthoekig raam
        g.drawRect(600,400,40,40);
        g.drawRect(610,400,40,40);
        g.drawRect(300, 400, 40, 40);
        g.drawRect(310,400,40,40);
        // een ovaal vormig raam
        g.drawOval(700,600,40,40);
        // het dak
        g.drawLine(200,200,500,50);
        g.drawLine(500,50,800,200);
        // deurklink
        g.drawOval(410,650,7,7);
        // brievenbus
        g.drawRect(410,670,30,5);

    }
}
