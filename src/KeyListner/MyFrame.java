package KeyListner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements KeyListener{
    
    JLabel l;

    MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
    this.setLayout (null);

    l = new JLabel();
    l.setBounds(0,0, 100,120);
    l.setBackground(Color.red);
    l.setOpaque(true);
    
    this.getContentPane().setBackground(Color.black);
    this.add(l);
    this.addKeyListener(this);
    this.setSize(450,450);
    this.setVisible(true);

    

    

    }
    @Override
    public void keyTyped (KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a':
                l.setLocation(l.getX()-1,l.getY());
                break;
            case 'w':
                l.setLocation(l.getX(),l.getY()-1);
                break;
            case 's':
                l.setLocation(l.getX(),l.getY()+1);
                break;
            case 'd':
                l.setLocation(l.getX()+1,l.getY());
                break;

        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("you releeased key cahr:"+ e.getKeyChar());
        System.out.println("you releeased key code:"+ e.getKeyCode());
        
    }

}
