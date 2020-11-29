package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Gum extends Product{                                   //Gum child class extends Product class

    public Gum(String nameIn, Double priceIn){                      //Gum constructor with nameIn and priceIn objects
        super(nameIn, priceIn);                                     //calls to parents class
        msg = "Chew Chew, Yum!";                                    //msg string
    }

    public Gum(){
        this("Rhino Chew", 0.25);
    }          //Method for Rhino Chew Gum


    @Override
    public String message() {
        return msg; }                          //Over rides parents class to return specific msg
}
