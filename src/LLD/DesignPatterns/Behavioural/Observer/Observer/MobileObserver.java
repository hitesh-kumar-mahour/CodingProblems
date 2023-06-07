package LLD.DesignPatterns.Behavioural.Observer.Observer;

import LLD.DesignPatterns.Behavioural.Observer.Observable.Observable;

public class MobileObserver implements DisplayObserver {

    private final Observable ws;

    public MobileObserver(Observable ws) {
        this.ws = ws;
    }
    @Override
    public void update() {
        System.out.println("Temp updated to " + ws.getData() + " in Mobile display");
    }
}
