package Label;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
public class Label {
    public static void main(String[] args){
        

        // crating a image to put in the frame
        // ImageIcon img = new ImageIcon("img.png");

        JLabel l = new JLabel();// create a abel
        l.setText("Damn hard to learn but got a nice guy!");// set the text of the label
        // l.setIcon(img);

        // used to create a border in the frame
        Border border = BorderFactory.createLineBorder(Color.green,4);

        // set horizontal text pos and vertical position
        l.setHorizontalTextPosition(JLabel.LEFT); 
        l.setVerticalTextPosition(JLabel.TOP);
        l.setForeground(Color.green); //change the text of the color
        l.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font of text
        // l.setIconTextGap(100);
        l.setBackground(Color.black);
        l.setOpaque(true);
        l.setBorder(border);

        // set vertical and horizontal position
        l.setVerticalAlignment(JLabel.CENTER); 
        l.setHorizontalAlignment(JLabel.CENTER);
        // l.setBounds(23,34,450,250);

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);
        // when we eanble setlayout the we have to set the bounds
        // f.setLayout(null);
        f.add(l);
        f.pack(); // it packs within the frame and size



    }
}
