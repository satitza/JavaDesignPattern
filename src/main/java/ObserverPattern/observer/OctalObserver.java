package ObserverPattern.observer;

import ObserverPattern.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String : " + Integer.toOctalString(subject.getState()));
    }
}
