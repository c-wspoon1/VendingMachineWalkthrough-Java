package com.codedifferently.walkthrough.vendingmachine.inventory;

public abstract class Product {

    private String name;                                        //inititalizes private variable named name of type String
    private Double price;                                       //inititalizes private variable named price of type Double
    protected String msg;                                       //inititalizes protected variable named msg of type String

    public Product(String name, Double priceIn){            //Constructor method with name and priceIN objects
        this.name = name;                                   //sets constructor object name to private name variable
        this.price = priceIn;                               //sets constructor object priceIn to private price variable
    }

    public String getName(){
        return name;
    }               //getter to return name

    public Double getPrice(){
        return price;
    }             //getter to return price

    @Override                                                   //Allows child class to override parent class
    public String toString(){
        return name + " " + price;
    }       //Metod to return String of name and price

    public abstract String message();
}
