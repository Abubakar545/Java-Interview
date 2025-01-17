package com.syed.java.designpattern_singleton;

public class LazyInitialization {

    private static LazyInitialization instance;

    private LazyInitialization(){}

    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }

    // The instance is not created until it is needed.
//    private static Singleton instance;
//
//    // Private constructor to prevent instantiation from other classes.
//    private Singleton() {}
//
//    // Method to provide access to the singleton instance.
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
}
