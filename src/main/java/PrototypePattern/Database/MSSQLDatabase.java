package PrototypePattern.Database;

public class MSSQLDatabase extends PrototypeDatabase {

    public MSSQLDatabase() {
        databaseName = "MSSQL Server";
    }

    @Override
    void startConnection() {
        System.out.println(databaseName + " start connection ... ");
    }
}
