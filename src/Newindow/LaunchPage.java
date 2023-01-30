package Newindow;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LaunchPage implements ActionListener {
    JFrame f = new JFrame();
    JButton b = new JButton("Login");

    LaunchPage(){

        b.setBounds(100,160,200,50);
        b.setFocusable(false);
        b.addActionListener(this);

        f.add(b);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.gray);
        f.setLayout(null);
        f.setVisible(true);

    }
    @Override
        public void actionPerformed (ActionEvent e) {
         if(e.getSource() == b){
            f.dispose(); // it will delete the window when we open other window
            Newlywind nw = new Newlywind();
         }
        }
}
