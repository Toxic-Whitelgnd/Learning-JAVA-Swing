package LayerdPaneL;

import javax.swing.*;
import java.awt.*;

public class LayerdPaneL {
    public static void main(String[] args)  {

        JFrame f = new JFrame();

        JLabel lb = new JLabel();
        lb.setOpaque(true);
        lb.setBackground(Color.red);
        lb.setBounds(50,50,200,200);

        JLabel lb2 = new JLabel();
        lb2.setOpaque(true);
        lb2.setBackground(Color.green);
        lb2.setBounds(100,100,200,200);
        JLabel lb3 = new JLabel();
        lb3.setOpaque(true);
        lb3.setBackground(Color.blue);
        lb3.setBounds(150,150,200,200);
        JLabel lb4 = new JLabel();
        lb4.setOpaque(true);
        lb4.setBackground(Color.yellow);
        lb4.setBounds(180,180,200,200);

        JLayeredPane lp = new JLayeredPane();
        lp.setBounds(10,10,500,500);
        // higer the number higer the placement of the label in the layerd pane
        lp.add(lb,Integer.valueOf(0));
        lp.add(lb2,Integer.valueOf(3));
        lp.add(lb3,Integer.valueOf(3));
        lp.add(lb4,Integer.valueOf(4));

        f.add(lp);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.gray);
        f.setLayout(null);

        

        f.setVisible(true);


    }
}