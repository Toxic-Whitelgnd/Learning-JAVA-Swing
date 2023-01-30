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
        slider = new JSlider();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
