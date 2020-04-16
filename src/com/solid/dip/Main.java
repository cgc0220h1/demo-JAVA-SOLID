package com.solid.dip;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = new OracleConnection();
        DatabaseConfig config = new DatabaseConfig(dbConnection);
        DBConnection dbConnection1 = config.getDbConnection();
        dbConnection1.connect();
    }
}
