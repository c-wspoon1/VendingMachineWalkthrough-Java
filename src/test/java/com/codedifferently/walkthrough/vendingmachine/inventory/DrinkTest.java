package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class DrinkTest {

    @Test
    public void constructorTest(){
        //Given
        String name = "Sprite";
        Double price = 1.25;
        Drinks drink1 = new Drinks(name, price);

        //When
        String expected = name + " " + price;
        String actual = drink1.toString();

        //Then
        Assert.assertEquals("Constructor Test", expected, actual);
    }

    @Test
    public void messageTest() {
        //Given
        Drinks drink = new Drinks();

        //When
        String expected = "Glug Glug, Yum!";
        String actual = drink.message();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
