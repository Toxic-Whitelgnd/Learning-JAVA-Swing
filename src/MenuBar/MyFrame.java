package MenuBar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{

    JMenuBar mb;
    JMenu fm,edit,help;
    JMenuItem imp,save,exit;



    MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
    mb = new JMenuBar();
    fm = new JMenu("file");
    edit = new JMenu("edit");
    help = new JMenu("help");

    mb.add(fm);
    mb.add(edit);
    mb.add(help);

    imp = new JMenuItem("import");
    save = new JMenuItem("save");
    exit = new JMenuItem("exit");

    imp.addActionListener(this);
    save.addActionListener(this);
    exit.addActionListener(this);

    // keyboard sortcut
    imp.setMnemonic(KeyEvent.VK_L); // L for load
    save.setMnemonic(KeyEvent.VK_S); // S for save
    exit.setMnemonic(KeyEvent.VK_E); //E FOR EXIT
    
    fm.add(imp);
    fm.add(save);
    fm.add(exit);

    this.setJMenuBar(mb);
    this.setSize(500,500);
    this.setLayout (new FlowLayout());
    this.setVisible(true);
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == imp){
            System.out.println("clcked on the impor tbtn");
        }
        if(e.getSource() == save){
            System.out.println("clcked on the save tbtn");
        }
        if(e.getSource() == exit){
            System.exit(0);
        }
    }
}
