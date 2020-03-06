package AbstractFactoryPattern.Software.Windows;

import AbstractFactoryPattern.Enum.EnumPlatform;
import AbstractFactoryPattern.Enum.EnumSoftware;
import AbstractFactoryPattern.Software.WindowsSoftware;

public class WindowsBrowser extends WindowsSoftware {


    @Override
    public void printPlatform() {
        System.out.println(EnumPlatform.WINDOWS.toString());
    }

    @Override
    public void printName() {
        System.out.println(EnumSoftware.BROWSER.toString());
    }
}
