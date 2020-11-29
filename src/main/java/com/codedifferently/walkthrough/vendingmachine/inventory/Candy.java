package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Candy extends Product{

    public Candy(String nameIn, Double priceIn){
        super(nameIn, priceIn);

        msg = "Smack Smack, Yum!";

    }

    public Candy(){
        this("Sour Skittles", 1.15);
    }


    @Override
    public String message() {
        return msg;
    }
}
