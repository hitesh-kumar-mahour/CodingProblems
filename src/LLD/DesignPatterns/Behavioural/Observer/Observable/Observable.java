package LLD.DesignPatterns.Behavioural.Observer.Observable;

import LLD.DesignPatterns.Behavioural.Observer.Observer.DisplayObserver;

public interface Observable {
    void add(DisplayObserver display);

    void remove(DisplayObserver display);

    void notifyObservers();

    void setData(int data);

    int getData();
}
