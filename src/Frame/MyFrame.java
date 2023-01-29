package Frame;
import javax.swing.*;
import java.awt.Color;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("new titnel"); // setting the tiltle
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevenst frame from resized
        this.setSize(420,420); //setting the x-dimension and y-dimension
        this.setVisible(true); // make frame visible visible

        // ImageIcon img = new ImageIcon("path of the image and name");
        // this.setIconImage(img.getImage());

        this.getContentPane().setBackground(new Color(234,34,67)); // for hex use 0x6didgit number
    }
    
        
}
