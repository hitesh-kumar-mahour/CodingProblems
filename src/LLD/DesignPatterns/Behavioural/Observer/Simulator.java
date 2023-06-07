package LLD.DesignPatterns.Behavioural.Observer;

import LLD.DesignPatterns.Behavioural.Observer.Observable.WeatherStationObservableImpl;
import LLD.DesignPatterns.Behavioural.Observer.Observer.MobileObserver;
import LLD.DesignPatterns.Behavioural.Observer.Observer.TVObserver;

public class Simulator {

    public static void main(String[] args) {
        WeatherStationObservableImpl ws = new WeatherStationObservableImpl();
        ws.add( new MobileObserver(ws));
        ws.add( new TVObserver(ws));
        ws.setData(50);
        ws.setData(20);
        ws.setData(20);
        ws.setData(30);
    }
}
