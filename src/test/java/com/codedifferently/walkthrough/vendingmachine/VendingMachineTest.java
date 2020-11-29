package com.codedifferently.walkthrough.vendingmachine;

import com.codedifferently.walkthrough.vendingmachine.inventory.Candy;
import com.codedifferently.walkthrough.vendingmachine.inventory.Drinks;
import com.codedifferently.walkthrough.vendingmachine.inventory.Product;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class VendingMachineTest {
    private final static Logger logger = Logger.getLogger(VendingMachineTest.class);

    @Test
    public void stockVendingMachineTest(){
        String[] sample = {"A1|Sour Skittles|1.00|Candy"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);
        Product expectedCandy = new Candy("Sour Skittles", 1.15);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actualCandy = inventory.get("A1");

        Assert.assertEquals(expectedCandy.getName(), actualCandy.getName());
    }
    @Test
    public void stockVendingMachineTest2(){
        String[] sample = {"D1|Sprite|1.25|Drinks"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);
        Product expectedDrinks = new Drinks("Sprite", 1.25);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actualDrinks = inventory.get("D1");

        Assert.assertEquals(expectedDrinks.getName(), actualDrinks.getName());
    }
}
