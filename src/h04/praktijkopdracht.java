package h04;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht extends Applet {

    String vorm;

    public void init() {

        setSize(1000, 1000);

        // LIJN

        vorm = "lijn";
        vorm = "rechthoek";


    }

    public void paint(Graphics g) {

        // LIJN

        g.drawLine(100, 100, 300, 100);
        g.drawString(vorm = "lijn", 200,115);

        // RECHTHOEK

        g.drawRect(100, 300, 200, 100);
        g.drawString(vorm ="rechthoek", 175, 415);

        // GEVULDE RECHTHOEK MET OVAAL

        g.setColor(Color.magenta);
        g.fillRect(400,300,200,100);
        g.setColor(Color.black);
        g.drawOval(400,300,200,100);
        g.drawString(vorm ="rechthoek met ovaal", 450,415);

        // TAARTPUNT MET OVAAL ER OMHEEN

        g.drawOval(700,300,200,100);
        g.setColor(Color.magenta);
        g.fillArc(700, 300,200,100,360,50);
        g.setColor(Color.black);
        g.drawString(vorm = "taartpunt met ovaal eromheen",730,415);

        // AFGERONDE RECHTHOEK

        g.drawRoundRect(100, 600, 200,100,45,45);
        g.drawString(vorm = "afgeronde rechthoek", 140, 715);

        // GEVULDE OVAAL

        g.setColor(Color.magenta);
        g.fillOval(400,600,200,100);
        g.setColor(Color.black);
        g.drawString(vorm = "gevulde ovaal", 460,715);

        // CIRKEL

        g.drawOval(700,600,150,150);
        g.drawString(vorm = "cirkel",760,765);

    }

}
