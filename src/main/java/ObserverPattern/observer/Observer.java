package ObserverPattern.observer;

import ObserverPattern.Subject;

public abstract class Observer {

    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    public abstract void update();

}
