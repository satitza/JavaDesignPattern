package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Enum.EnumSoftware;
import AbstractFactoryPattern.Software.Linux.LinuxBrowser;
import AbstractFactoryPattern.Software.Linux.LinuxIDE;
import AbstractFactoryPattern.Software.LinuxSoftware;

public class LinuxPlatform extends SoftwareFactory {

    @Override
    public LinuxSoftware getSoftware(EnumSoftware softwareName) {

        if (softwareName == null) {
            return null;
        } else if (softwareName == EnumSoftware.BROWSER) {
            return new LinuxBrowser();
        } else if (softwareName == EnumSoftware.IDE) {
            return new LinuxIDE();
        }

        return null;
    }
}
