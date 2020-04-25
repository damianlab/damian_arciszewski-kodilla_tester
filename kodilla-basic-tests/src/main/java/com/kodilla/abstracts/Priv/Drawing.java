package com.kodilla.abstracts.Priv;
import javax.swing.JFrame;
import java.awt.*;

public class Drawing extends JFrame{
    public static void main(String[] args) {
        new Drawing();

    }
    public Drawing() {
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(50,50,100,25);


    }
}
