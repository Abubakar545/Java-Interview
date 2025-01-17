package com.syed.java.designpattern_singleton;

public class Initialization {

    private static volatile Initialization instance;

    private Initialization(){}

    public static Initialization getInstance(){
        if(instance == null){
            synchronized (Initialization.class){
                if(instance == null){
                    instance = new Initialization();
                }
            }
        }
        return instance;
    }

//    private static Initialization instance;
//
//    private Initialization(){}
//
//    public static Initialization getInstance(){
//        if(instance == null){
//            instance = new Initialization();
//        }
//        return instance;
//    }

//    private static final Initialization instance = new Initialization();
//
//    private Initialization(){}
//
//    public static Initialization getInstance(){
//        return instance;
//    }
}
