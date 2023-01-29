package Panels;

import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args)  {

        JLabel redl = new JLabel();
        redl.setText("hi from red");

        JLabel bluel = new JLabel();
        bluel.setText("hi from blue");
        //this will be using when we use borderlayout if not use setBounds
        bluel.setVerticalAlignment(JLabel.BOTTOM);
        bluel.setHorizontalAlignment(JLabel.RIGHT);
        
        bluel.setBounds(30,0,75,75);
        
        JPanel redp = new JPanel();
        redp.setBackground(Color.RED);
        redp.setBounds(0,0,200,200);

        JPanel bluep = new JPanel();
        bluep.setBackground(Color.blue);
        bluep.setBounds(200,0,200,200);

        // use the normal layout places the content left center if not it uses row 
        // bluep.setLayout(new BorderLayout());
        bluep.setLayout(null); //then use setBounds

        JPanel greenp = new JPanel();
        greenp.setBackground(Color.green);
        greenp.setBounds(0,200,400,400);
        

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(750,750);
        f.setLayout(null);
        f.setVisible(true);

        redp.add(redl);
        bluep.add(bluel);

        f.add(redp);
        f.add(bluep);
        f.add(greenp);
    }
}
