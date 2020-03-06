package FactoryPattern;

import FactoryPattern.Database.DatabaseProvider;
import FactoryPattern.Database.MSSQLServer;
import FactoryPattern.Database.MySQLDatabase;
import FactoryPattern.Database.OracleDatabase;

public class DatabaseFactory {

    public DatabaseProvider getDatabaseConnection(String DBType) {

        if (DBType == null) {
            return null;
        } else if (DBType.equalsIgnoreCase("MSSQL")) {
            return new MSSQLServer();
        } else if (DBType.equalsIgnoreCase("Oracle")) {
            return new OracleDatabase();
        } else if (DBType.equalsIgnoreCase("MySQL")) {
            return new MySQLDatabase();
        }

        return null;
    }

}
