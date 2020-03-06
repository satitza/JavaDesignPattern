package FactoryPattern.Database;

public class MySQLDatabase implements DatabaseProvider {

    @Override
    public void getConnection() {
        System.out.println("My Sql start connection.");
    }
}
