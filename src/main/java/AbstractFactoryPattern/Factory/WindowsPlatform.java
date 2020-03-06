package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Enum.EnumSoftware;
import AbstractFactoryPattern.Software.Windows.WindowsBrowser;
import AbstractFactoryPattern.Software.Windows.WindowsIDE;
import AbstractFactoryPattern.Software.WindowsSoftware;

public class WindowsPlatform extends SoftwareFactory {

    @Override
    public WindowsSoftware getSoftware(EnumSoftware softwareName) {

        if (softwareName == null) {
            return null;
        } else if (softwareName == EnumSoftware.BROWSER) {
            return new WindowsBrowser();
        } else if (softwareName == EnumSoftware.IDE) {
            return new WindowsIDE();
        }

        return null;
    }

}
