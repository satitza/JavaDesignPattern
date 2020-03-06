package AbstractFactoryPattern;

import AbstractFactoryPattern.Enum.EnumPlatform;
import AbstractFactoryPattern.Enum.EnumSoftware;
import AbstractFactoryPattern.Factory.SoftwareFactory;
import AbstractFactoryPattern.Software.Software;

public class MainApp {

    private static SoftwareFactory producer;

    private static Software browser, ide;

    public static void main(String[] args) {

        System.out.println("Abstract Factory Pattern.");
        producer = SoftwareProducer.getSoftwareFactory(EnumPlatform.LINUX);

        browser = producer.getSoftware(EnumSoftware.BROWSER);
        browser.printName();
        browser.printPlatform();

        producer = SoftwareProducer.getSoftwareFactory(EnumPlatform.WINDOWS);
        browser = producer.getSoftware(EnumSoftware.BROWSER);
        browser.printName();
        browser.printPlatform();

        ide = producer.getSoftware(EnumSoftware.IDE);
        ide.printName();
        ide.printPlatform();

    }

}
