package com.solid.dip;

public class MySQLConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("MySQL connected");
    }
}
