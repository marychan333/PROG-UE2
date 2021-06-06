package trafficlight.gui;


import javax.swing.*;
import java.awt.*;

class Light extends JPanel {
    Color on;
    int radius = 40;
    int border = 10;
    boolean isOn = false;

    Light(Color color){
        on = color;
    }

    public Light() {
        // Constructor for TrafficLight
    }

    public Dimension getPreferredSize(){
        int circleSize = ( radius + border ) * 2;
        return new Dimension( circleSize, circleSize );
    }

    public void paintComponent(Graphics g){
        g.setColor( Color.black );
        g.fillRect(0,0,getWidth(),getHeight());

        if (isOn){
            g.setColor( on );
        } else {
            g.setColor( on.darker().darker().darker() );
        }
        g.fillOval( border,border,2 * radius,2 * radius );
    }
}