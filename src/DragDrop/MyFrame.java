package DragDrop;

import javax.swing.JFrame;
public class MyFrame extends JFrame{

        DragPanel dp = new DragPanel();

        MyFrame() {
        this.setTitle("Drag & Drop demo");

        this.add(dp);
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        }
}
