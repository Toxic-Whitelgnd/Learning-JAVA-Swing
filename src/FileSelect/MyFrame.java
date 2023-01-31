package FileSelect;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
    JButton btn;
    MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
    
    btn = new JButton("Select a file");
    btn.addActionListener(this);
    
    this.add(btn);
    this.setLayout (new FlowLayout());
    this.pack();
    this.setVisible(true);
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == btn){
            JFileChooser fs = new JFileChooser();
            // int res = fs.showOpenDialog(null); //selet a file to open
            int res = fs.showSaveDialog(null); //select a file to save
            System.out.println(fs);

            if(res == JFileChooser.APPROVE_OPTION){
                File fl = new File(fs.getSelectedFile().getAbsolutePath());
                System.out.println(fl);
            }
        }
    }
}
