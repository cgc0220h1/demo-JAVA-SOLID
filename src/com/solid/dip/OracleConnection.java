package com.solid.dip;

public class OracleConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("Oracle connected");
    }
}
