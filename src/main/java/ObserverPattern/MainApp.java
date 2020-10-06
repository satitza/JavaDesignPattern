package ObserverPattern;

import ObserverPattern.observer.BinaryObserver;
import ObserverPattern.observer.HexObserver;
import ObserverPattern.observer.OctalObserver;

public class MainApp {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);

        System.out.println("Set state 15");
        subject.setState(15);
    }
}
