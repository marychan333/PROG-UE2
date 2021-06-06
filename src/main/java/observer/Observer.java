package observer;

interface Observable {
    void notifyObservers();
    void addObserver(Observer o);
}

interface Observer {
    void update(Observable o, Object arg);
}

