package ObserverPattern;

public class MainApp {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new BinaryObserver(subject);

        System.out.println("Set state 15");
        subject.setState(15);
    }
}
