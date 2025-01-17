package com.syed.java;


public class ExecutionOrderExample {

    // Static variable
    static String staticVar = "Static Variable";

    // Instance variable
    String instanceVar = "Instance Variable";

    // Static block
    static {
        System.out.println("Static Block 1");
        System.out.println("Static Variable Value: " + staticVar);
    }

    // Instance initializer block
    {
        System.out.println("Instance Initializer Block 1");
        System.out.println("Instance Variable Value: " + instanceVar);
    }

    // Constructor
    public ExecutionOrderExample() {
        System.out.println("Constructor");
        instanceVar = "Instance Variable (Modified in Constructor)";
    }

    // Static block
    static {
        System.out.println("Static Block 2");
    }

    // Instance initializer block
    {
        System.out.println("Instance Initializer Block 2");
    }

    // Method
    public void display() {
        System.out.println("Display Method");
        System.out.println("Instance Variable Value in Method: " + instanceVar);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        // Create an instance of the class
        ExecutionOrderExample example = new ExecutionOrderExample();

        // Call a method
        example.display();
    }
}

