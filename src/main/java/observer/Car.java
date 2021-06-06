package observer;


public class Car {
    private static final String car = "Car";

    public void move(){
        System.out.println("Green Light on, keep going.");
        move();
    }

    public void stop(){
        System.out.println("Red Light on, waiting.");
        stop();
    }
}
