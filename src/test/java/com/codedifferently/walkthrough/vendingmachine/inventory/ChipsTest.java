package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class ChipsTest {

    @Test
    public void ConstructorTest() {
        //Given
        String name = "Doritos";
        Double price = 1.00;
        Chips chips1 = new Chips(name, price);

        //When
        String expected = name + " " + price;
        String actual = chips1.toString();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void messageTest(){
        //Given
        Chips chips = new Chips();

        //When
        String expected = "Crunch Crunch, Yum!";
        String actual = chips.message();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
