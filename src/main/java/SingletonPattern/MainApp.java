package SingletonPattern;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Singleton Pattern.");

        SingleObject singleObject1 = SingleObject.getSingletonObject();
        SingleObject singleObject2 = SingleObject.getSingletonObject();

        System.out.println(singleObject1.hashCode());
        System.out.println(singleObject2.hashCode());
        System.out.println(singleObject1.equals(singleObject2));

    }

}
