package textfield;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.*;

public class MyFrame extends JFrame implements ActionListener{
    JTextField tf;
    JButton bt;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf = new JTextField();
        tf.setPreferredSize(new Dimension(250,50));
        tf.setFont(new Font("Consolas", Font.BOLD,23));
        tf.setForeground(Color.red);
        tf.setBackground(Color.black);
        tf.setCaretColor(Color.GREEN);
        tf.setText("write something..");
        

        bt = new JButton("sUMBIT");
        bt.addActionListener(this);
        this.add(tf);
        this.add(bt);
        this.setLayout (new FlowLayout());
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == bt){
            System.out.println(tf.getText());
            tf.setEditable(false);
            bt.setEnabled(false);
        }
    }
}
