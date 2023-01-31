package DragDrop;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



import java.awt.*;
import java.awt.event.*;

public class DragPanel extends JPanel  {

    ImageIcon img = new ImageIcon("akastores.png");
    final int WIDTH = img.getIconWidth();
    final int HEIGHT = img.getIconHeight();
    Point imageCorner;
    Point prevPt;

    DragPanel(){
        imageCorner = new Point(0,0);
        ClickListener cl = new ClickListener();
        DragListener dl = new DragListener();
        this.addMouseListener(cl);
        this.addMouseMotionListener(dl);
        
    }

    public void paintComponent(Graphics g){
        // read paint after we update the new position
        super.paintComponent(g);
        img.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());

    }
    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e){
                prevPt = e.getPoint();
                
        }

    }
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();

            imageCorner.translate(
               (int)(currentPt.getX() - prevPt.getX())
            ,
            (int)(currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();
        }
    }

}
