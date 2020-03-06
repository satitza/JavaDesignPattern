package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Enum.EnumSoftware;
import AbstractFactoryPattern.Software.Software;

public abstract class SoftwareFactory {

    abstract public Software getSoftware(EnumSoftware softwareName);

}
