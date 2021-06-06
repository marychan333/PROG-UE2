package trafficlight.gui;

import javax.swing.*;
import java.awt.*;


public class TrafficLight extends Light {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    //TODO implement a part of the pattern here

    public TrafficLight() {
        super();
        JButton botton1 = new JButton("Green");
        JButton botton2 = new JButton("Yellow");
        JButton botton3 = new JButton("Red");

        botton1.addActionListener(new ButtonListener());
        add(botton1);
        botton2.addActionListener(new ButtonListener());
        add(botton2);
        botton3.addActionListener(new ButtonListener());
        add(botton3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light");
        JPanel lights = new JPanel( new GridLayout(0,3) );
        lights.add( new Light(Color.green) );
        lights.add( new Light(Color.yellow) );
        lights.add( new Light(Color.red) );

        frame.setContentPane(lights);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(on);
        g.fillRect(0,0,getWidth(),getHeight());

        if(getDropTarget().isActive()){
            g.setColor(on);
        }else{
            g.setColor(on.darker().darker().darker());
        }g.fillOval(border,border, 2*radius, 2*radius);

    }
}
