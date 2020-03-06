package AbstractFactoryPattern.Software.Linux;

import AbstractFactoryPattern.Enum.EnumPlatform;
import AbstractFactoryPattern.Enum.EnumSoftware;
import AbstractFactoryPattern.Software.LinuxSoftware;

public class LinuxBrowser extends LinuxSoftware {

    @Override
    public void printPlatform() {
        System.out.println(EnumPlatform.LINUX.toString());
    }

    @Override
    public void printName() {
        System.out.println(EnumSoftware.BROWSER.toString());
    }

}
