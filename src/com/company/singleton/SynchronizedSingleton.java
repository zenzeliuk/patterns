package com.company.singleton;

public class SynchronizedSingleton {

    private static volatile SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        super();
    }

    public static SynchronizedSingleton getInstance() {
        if (instance == null) {
            synchronized (SynchronizedSingleton.class) {
                if (instance == null) {
                    instance = new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
