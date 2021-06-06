package observer;

import sun.jvm.hotspot.utilities.Observable;

public  class Driver {
    //Driver as Listener
    public static void main(String[] args) {


    }
    public void update(Observable ob, String station) {

        if ( "red".equals(station)) {
            stop();
        }else if ("green".equals(station)){
            move();
        }else{
            System.out.println("Traffic Lights out of order!");
        }
    }

    private void move(){
        System.out.println("Keep going.");
    }
    private void stop(){
        System.out.println("Stop.");
    }

}
