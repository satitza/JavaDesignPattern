package SingletonPattern;

public class SingleObject extends Object {

    private static SingleObject singleObject = new SingleObject();

    private SingleObject() {

    }

    public static SingleObject getSingletonObject() {
        return singleObject;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
