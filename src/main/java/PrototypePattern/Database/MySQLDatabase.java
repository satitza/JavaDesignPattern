package PrototypePattern.Database;

public class MySQLDatabase extends PrototypeDatabase {

    public MySQLDatabase() {
        databaseName = "My SQL";
    }

    @Override
    void startConnection() {
        System.out.println(databaseName + " start connection ... ");
    }
}
