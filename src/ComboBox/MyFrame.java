package ComboBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
    JComboBox cb;
    MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
    this.setLayout (new FlowLayout());

    String[] animals = {"dog","cat","bird"};
    // for integer use
    // Integer[] fk = {1,2,3,4,5};
    
    cb = new JComboBox(animals);
    cb.addActionListener(this);
    cb.setEditable(false);
    
    cb.addItem("fish");
    cb.insertItemAt("pig", 0);
    cb.setSelectedIndex(0);
    // cb.removeItem("cat");
    // cb.removeItemAt(2);

    System.out.println(cb.getItemCount());
    this.add(cb);


    this.pack();
    this.setVisible(true);
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == cb){
            System.out.println(cb.getSelectedItem());
            System.out.println(cb.getSelectedIndex());
        }
    }
}

// template
/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
    MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
    this.setLayout (new FlowLayout());
    this.pack();
    this.setVisible(true);
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        
    }
}
 */