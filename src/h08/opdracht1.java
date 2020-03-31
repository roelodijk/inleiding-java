package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class opdracht1 extends Applet {

    Button knop;
    Button knopl;
    String s;

    public void init() {

        setSize(500,100);

        s = "";

        // TEKSTVAK
        TextField tekstvak;
        tekstvak = new TextField("",50);
        add (tekstvak);
        tekstvak.addActionListener(new TekstvakListener());

        // OK KNOP
        knop = new Button();
        knop.setLabel("ok");
        KnopListener kl = new KnopListener ();
        knop.addActionListener(kl);
        add (knop);

        // RESET KNOP
        knop = new Button();
        knop.setLabel("reset");
        KnopListener knopl = new KnopListener();
        knop.addActionListener(knopl);
        add (knop);

    }

    public void paint(Graphics g) {

        g.drawString(s, 210,50);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

        }
    }

    class knopl implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

}
