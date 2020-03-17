package PrototypePattern.Database;

public abstract class PrototypeDatabase implements Cloneable {

    private String objectId;

    protected String databaseName;

    abstract void startConnection();

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public Object clone() {

        Object object = null;

        try {

            object = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return object;

    }
}
