package AbstractFactoryPattern.Software.Linux;

import AbstractFactoryPattern.Enum.EnumPlatform;
import AbstractFactoryPattern.Enum.EnumSoftware;
import AbstractFactoryPattern.Software.LinuxSoftware;

public class LinuxIDE implements LinuxSoftware {

    @Override
    public void printPlatform() {
        System.out.println(EnumPlatform.LINUX.toString());
    }

    @Override
    public void printName() {
        System.out.println(EnumSoftware.IDE.toString());
    }
}
