package FlowLayoutl;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutl {
    public static void main(String[] args)  {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING,10,30)); // center,left,leading,right,trailing
        // horizontal gap and vertical gap spacing

        JPanel pa = new JPanel();
        pa.setPreferredSize(new Dimension(150,250));
        pa.setBackground(Color.cyan);
        pa.setLayout(new FlowLayout());

        // frame.add(new JButton("1"));
        // frame.add(new JButton("2"));
        // frame.add(new JButton("3"));
        // frame.add(new JButton("4"));
        // frame.add(new JButton("5"));
        // frame.add(new JButton("6"));
        // frame.add(new JButton("7"));
        // frame.add(new JButton("8"));
        // frame.add(new JButton("9"));

        pa.add(new JButton("1"));
        pa.add(new JButton("2"));
        pa.add(new JButton("3"));
        pa.add(new JButton("4"));
        pa.add(new JButton("5"));
        pa.add(new JButton("6"));
        pa.add(new JButton("7"));
        pa.add(new JButton("8"));
        pa.add(new JButton("9"));

        frame.add(pa);
        frame.setVisible(true);
    }
}
