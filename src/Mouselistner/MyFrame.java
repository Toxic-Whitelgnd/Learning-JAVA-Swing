package Mouselistner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{

    JLabel l;
    MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout (null);
    this.setVisible(true);

    l = new JLabel();
    l.setBounds(0,0, 100,120);
    l.setBackground(Color.red);
    l.setOpaque(true);
    
    this.getContentPane().setBackground(Color.black);
    this.add(l);

    this.addMouseListener(this);

    }

@Override
public void mouseClicked(MouseEvent e) {
    // TODO Auto-generated method stub
    System.out.println("yo clicked the mouse button");
}

@Override
public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub
    System.out.println("yo entered the mouse button");
    
}

@Override
public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub
    System.out.println("yo exited the mouse button");
    
}

@Override
public void mousePressed(MouseEvent e) {
    // TODO Auto-generated method stub
    System.out.println("yo pressed the mouse button");
    l.setBackground(Color.yellow);
}

@Override
public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub
    System.out.println("yo released the mouse button");
    l.setBackground(Color.blue);
}
    
}