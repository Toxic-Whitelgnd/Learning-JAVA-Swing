package Newindow;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Newlywind {
    JFrame f = new JFrame();
    JLabel l = new JLabel("hellow user welcome here we go!");
    Newlywind(){

        l.setBounds(50,50,400,80);

        f.add(l);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.gray);
        f.setLayout(null);
        f.setVisible(true);
    }
}
