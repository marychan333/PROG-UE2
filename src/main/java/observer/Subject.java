package observer;

import sun.jvm.hotspot.utilities.Observer;
import java.util.ArrayList;

public abstract class Subject {
    private final ArrayList<Observer> observers = new ArrayList<Observer>();

    //todo
    public void addObserver(Observer ob){
        observers.add(ob);
    }
    //todo
    public void removeObserver(Observer ob){
        observers.remove(ob);
    }
    //todo
    public void notifyObserver(String info){
       observers.notify();
    }

    public abstract void move();

    public abstract void stop();
}