package LLD.DesignPatterns.Behavioural.Observer.Observable;

import LLD.DesignPatterns.Behavioural.Observer.Observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservableImpl implements Observable {

    private final List<DisplayObserver> displays;
    private int temp;

    public WeatherStationObservableImpl() {
        this.displays = new ArrayList<>();
    }

    @Override
    public void add(DisplayObserver display) {
        this.displays.add(display);
    }

    @Override
    public void remove(DisplayObserver display) {
        this.displays.remove(display);
    }

    @Override
    public void notifyObservers() {
        for (DisplayObserver display : this.displays) {
            display.update();
        }
    }

    @Override
    public void setData(int newTemp) {
        if (newTemp != temp) {
            temp = newTemp;
            notifyObservers();
        }
    }

    @Override
    public int getData() {
        return temp;
    }
}
