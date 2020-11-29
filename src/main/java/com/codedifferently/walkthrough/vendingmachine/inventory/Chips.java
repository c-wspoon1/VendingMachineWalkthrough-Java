package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Chips extends Product{

    public Chips(String nameIn, Double priceIn){
        super(nameIn, priceIn);
        msg = "Crunch Crunch, Yum!";
    }

    public Chips(){
        this("Doritos", 1.00);
    }

    @Override
    public String message() {
        return msg;
    }
}
