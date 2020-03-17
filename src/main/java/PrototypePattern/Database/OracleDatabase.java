package PrototypePattern.Database;

public class OracleDatabase extends PrototypeDatabase {

    public OracleDatabase() {
        databaseName = "Oracle database";
    }

    @Override
    void startConnection() {
        System.out.println(databaseName + " start connection ... ");
    }
}
