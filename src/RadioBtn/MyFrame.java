package RadioBtn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.*;

public class MyFrame extends JFrame implements ActionListener{
    
    JRadioButton pizbtn,hmbtn,hotbtn;
    ButtonGroup grp;
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pizbtn = new JRadioButton("pizza");
        hmbtn = new JRadioButton("Hambergur");
        hotbtn = new JRadioButton("hot");

        pizbtn.addActionListener(this);
        hmbtn.addActionListener(this);
        hotbtn.addActionListener(this);

        grp = new ButtonGroup();
        grp.add(pizbtn);
        grp.add(hmbtn);
        grp.add(hotbtn);

        this.add(pizbtn);
        this.add(hmbtn);
        this.add(hotbtn);
        this.setLayout (new FlowLayout());
        this.setSize(500,500);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == pizbtn){
            System.out.println("odererd puzza");
        }
        else if(e.getSource() == hmbtn){
            System.out.println("orderd hambergurer");

        }
        else{
            System.out.println("oredere hotbtn");
        }
    }
}
