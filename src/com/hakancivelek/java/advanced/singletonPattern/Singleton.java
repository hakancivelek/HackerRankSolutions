package com.hakancivelek.java.advanced.singletonPattern;

class Singleton {
    private static Singleton singleton = new Singleton();
    public String str;

    private Singleton() {

    }

    public static Singleton getSingleInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}