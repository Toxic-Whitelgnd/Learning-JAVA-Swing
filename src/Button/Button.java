package Button;

import javax.swing.*;
import java.awt.*;

public class Button{
    public static void main(String[] args)  {
        JFrame f = new JFrame();

        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.gray);
        f.setLayout(null);

        JButton b = new JButton();
        b.setText("Hello");
        b.setBounds(30,40,100,50);
        b.addActionListener(e -> System.out.println("print clicked me!"));
        b.setFocusable(false);
        b.setFont(new Font("Comic Sans ",Font.BOLD,25));
        // b.setHorizontalTextPosition(JButton.CENTER);
        // b.setVerticalTextPosition(JButton.RIGHT);
        b.setForeground(Color.RED);
        b.setBackground(Color.black);
        f.add(b);
    }
    
}

