package Sliders;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener{
    JFrame f;
    JPanel p;
    JLabel l;
    JSlider slider;

    SliderDemo(){
        f = new JFrame(" Slider Demo");
        p = new JPanel();
        l = new JLabel();
        
        slider = new JSlider(0,100,30); //START TO END , startpoint
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("Arial",Font.BOLD,34));

        slider.setOrientation(SwingConstants.VERTICAL);
        l.setText("cel = " + slider.getValue());
        slider.addChangeListener(this);

        p.add(slider);
        p.add(l);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        f.setSize(420,420);
        f.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        l.setText("cel = " + slider.getValue());

        
    }
    
}
