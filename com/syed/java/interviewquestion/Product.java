package com.syed.java.interviewquestion;

import java.util.ArrayList;
import java.util.List;

//Coding - if there are list of products which consists of food items and non food items
// so for food items apply 20% tax levied and for non food items 10% tax is levied
// so input should be product name followed by quantity and price of it so then
// calculate the total price with tax for all products which includes both food and non food items
public class Product {
    private String name;
    private int quantity;
    private double price;

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public double priceWithTax(){
        double taxRate;

        // List of food items
        List<String> foodItems = List.of("apple", "bread", "milk", "banana", "orange", "rice");

        if(foodItems.contains(name.toLowerCase())){
            taxRate = 0.20;
        }else{
            taxRate = 0.10;
        }

        return  price * (1 + taxRate);
    }

    public static void main(String[] args) {
        // List of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("apple", 2, 30.00));
        products.add(new Product("shampoo", 1, 150.00));
        products.add(new Product("bread", 1, 25.00));
        products.add(new Product("toothpaste", 3, 40.00));

        double totalPrice = 0.0;
        for (Product product:products){
            double priceWithTax = product.priceWithTax();
            totalPrice += priceWithTax * product.getQuantity();

            System.out.printf("Product %s, Quantity %d, Price (before tax) %.2f, Price (after tax) %.2f%n",
                    product.getName(), product.getQuantity(), product.getPrice(), priceWithTax);
        }

        System.out.printf("Total price after the tax: %.2f%n", totalPrice);
    }
}

