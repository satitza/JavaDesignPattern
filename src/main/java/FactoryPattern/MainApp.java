package FactoryPattern;

import FactoryPattern.Database.DatabaseProvider;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Factory Pattern.");

        DatabaseFactory factory = new DatabaseFactory();

        DatabaseProvider mssql = factory.getDatabaseConnection("MSSQL");
        mssql.getConnection();

        DatabaseProvider oracle = factory.getDatabaseConnection("Oracle");
        oracle.getConnection();

        DatabaseProvider mysql = factory.getDatabaseConnection("MySQL");
        mysql.getConnection();
    }

}
