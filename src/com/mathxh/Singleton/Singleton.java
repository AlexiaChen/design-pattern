package com.mathxh.Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("Make only one instance");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
