package com.company.singleton;

public class SimpleSingleton {

    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {
        super();
    }

    public static SimpleSingleton getInstance() {
        return INSTANCE;
    }
}
