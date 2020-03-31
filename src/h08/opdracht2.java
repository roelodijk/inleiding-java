package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht2 extends Applet {

    TextField tekstvak;
    Button knop;
    Button knop2;
    String schermtekst;

    public void init() {

        setSize(500,100);

        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);

        knop2 = new Button("reset");
        knop.addActionListener(new KnopListener());
        add(knop2);

        schermtekst = "";

    }

    public void paint(Graphics g) {

        g.drawString(schermtekst, 175,75);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "hoi hoe gaat het";
            repaint();

        }
    }

}
