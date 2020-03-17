package PrototypePattern;

import PrototypePattern.Database.PrototypeDatabase;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Prototype design pattern.");

        CacheDatabasePrototype.loadCache();

        PrototypeDatabase db1 = CacheDatabasePrototype.getPrototypeDatabase("1");
        PrototypeDatabase db2 = CacheDatabasePrototype.getPrototypeDatabase("1");

        System.out.println(db1.hashCode());
        System.out.println(db2.hashCode());

    }

}
