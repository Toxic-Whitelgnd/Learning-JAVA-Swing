package Checkboxes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


import java.awt.*;

public class MyFrame extends JFrame implements ActionListener{
    JButton btn;
    JCheckBox ck ;
    // ImageIcon xicon;
    // ImageIcon tickicon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btn = new JButton();
        btn.setText("sumbit");
        btn.addActionListener(this);

        // xicon = new ImageIcon("");
        // tickicon = new ImageIcon("");
        
        ck = new JCheckBox();
        ck.setText("what the fk");
        ck.setFocusable(false);
        ck.setFont(new Font("Helvetica", Font.PLAIN,34));
        // ck.setIcon(xicon);
        // ck.setSelectedIcon(tickicon);

        this.add(btn);
        this.add(ck);
        this.setLayout (new FlowLayout());
        this.setSize(500,500);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == btn){
             System.out.println(ck.isSelected());
        }
    }
}
