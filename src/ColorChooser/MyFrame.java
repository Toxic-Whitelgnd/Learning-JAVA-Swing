package ColorChooser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{

    JButton btn;
    JLabel l;

    MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;

    btn = new JButton("select a color");
    btn.addActionListener(this);

    l = new JLabel("this is some text");
    l.setOpaque(true);
    l.setBackground(Color.white);
    
    this.add(btn);
    this.add(l);
    this.setLayout (new FlowLayout());
    // this.pack();
    this.setSize(450,450);
    this.setVisible(true);
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == btn){
            JColorChooser col = new JColorChooser();
            Color colorcho = JColorChooser.showDialog(col, "Pick a color noob", Color.black);
            // l.setForeground(colorcho);
            l.setBackground(colorcho);
        }
    }
}
