package FactoryPattern.Database;

public class OracleDatabase implements DatabaseProvider {

    @Override
    public void getConnection() {
        System.out.println("Oracle database start connection.");
    }
}
