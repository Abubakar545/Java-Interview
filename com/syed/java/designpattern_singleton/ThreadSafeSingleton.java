package com.syed.java.designpattern_singleton;

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){

                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return  instance;
    }
    // The instance is volatile to ensure visibility among threads.
//    private static volatile Singleton instance;
//
//    // Private constructor to prevent instantiation from other classes.
//    private Singleton() {}
//
//    // Method to provide access to the singleton instance.
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
}
