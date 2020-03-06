package FactoryPattern;

import FactoryPattern.Database.*;

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
