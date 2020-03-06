package AbstractFactoryPattern;

import AbstractFactoryPattern.Enum.EnumPlatform;
import AbstractFactoryPattern.Factory.LinuxPlatform;
import AbstractFactoryPattern.Factory.SoftwareFactory;
import AbstractFactoryPattern.Factory.WindowsPlatform;

public class SoftwareProducer {

    public static SoftwareFactory getSoftwareFactory(EnumPlatform platform) {

        if (platform == EnumPlatform.WINDOWS) {
            return new WindowsPlatform();
        } else if (platform == EnumPlatform.LINUX) {
            return new LinuxPlatform();
        }

        return null;
    }

}
