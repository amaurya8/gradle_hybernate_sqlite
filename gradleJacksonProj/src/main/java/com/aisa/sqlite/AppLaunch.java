package com.aisa.sqlite;

public class AppLaunch {
    public static void main(String[] args) {

        PersistenceTest pt = new PersistenceTest();
        pt.setup();
        pt.saveMessage();

    }
}
