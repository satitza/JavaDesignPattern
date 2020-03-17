package PrototypePattern;

import PrototypePattern.Database.MSSQLDatabase;
import PrototypePattern.Database.MySQLDatabase;
import PrototypePattern.Database.OracleDatabase;
import PrototypePattern.Database.PrototypeDatabase;

import java.util.Hashtable;

public class CacheDatabasePrototype {

    private static Hashtable<String, PrototypeDatabase> cachePrototype = new Hashtable<>();

    public static PrototypeDatabase getPrototypeDatabase(String objectId) {
        PrototypeDatabase object = cachePrototype.get(objectId);
        return (PrototypeDatabase) object.clone();
    }

    public static void loadCache() {

        PrototypeDatabase mssqlDatabase = new MSSQLDatabase();
        mssqlDatabase.setObjectId("1");
        cachePrototype.put(mssqlDatabase.getObjectId(), mssqlDatabase);

        PrototypeDatabase oracleDatabase = new OracleDatabase();
        oracleDatabase.setObjectId("2");
        cachePrototype.put(oracleDatabase.getObjectId(), oracleDatabase);

        PrototypeDatabase mysqlDatabase = new MySQLDatabase();
        mysqlDatabase.setObjectId("3");
        cachePrototype.put(mysqlDatabase.getObjectId(), mysqlDatabase);
    }

}
