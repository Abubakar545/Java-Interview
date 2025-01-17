package com.syed.java.designpattern_singleton;
//This method creates the singleton instance at the time of class loading.
public class EagerInitialization {

    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return instance;
    }

    // Eagerly creating the instance.
//    private static final Singleton instance = new Singleton();
//
//    // Private constructor to prevent instantiation from other classes.
//    private Singleton() {}
//
//    // Method to provide access to the singleton instance.
//    public static Singleton getInstance() {
//        return instance;
//    }
}
