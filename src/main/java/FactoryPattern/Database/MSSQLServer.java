package FactoryPattern.Database;

public class MSSQLServer implements DatabaseProvider {

    @Override
    public void getConnection() {
        System.out.println("Oracle database start connection.");
    }
}
