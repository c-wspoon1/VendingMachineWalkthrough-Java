package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Drinks extends Product {

    public Drinks(String nameIn, Double priceIn){
        super(nameIn, priceIn);
        msg = "Glug Glug, Yum!";
    }

    public Drinks(){
        this("Sprite", 1.25);
    }

    @Override
    public String message() {
        return msg;
    }
}
