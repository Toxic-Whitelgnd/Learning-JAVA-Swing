package Progressbar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PBDemao {

    JFrame f = new JFrame();
    JProgressBar pb = new JProgressBar(0,100); //min and max


    PBDemao(){

        pb.setValue(0);
        pb.setBounds(10,20,350,50);
        pb.setFont(new Font("Arial",Font.BOLD,25));
        pb.setForeground(Color.red);
        pb.setBackground(Color.black);

        // set the percentage bar
        pb.setStringPainted(true);

        f.add(pb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        fill();
    }
    public void fill(){
        int ct = 0;
        while(ct <=100){
            pb.setValue(ct);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            ct +=1;
        }
        pb.setString("Done");
        
    }
}
