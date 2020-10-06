package ObserverPattern.observer;

import ObserverPattern.Subject;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
