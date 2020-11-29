package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class CandyTest {

    @Test
    public void ConstructorTest() {
        //Given
        String name = "Sour Skittles";
        Double price = 1.15;
        Candy candy1 = new Candy(name, price);

        //When
        String expected = "Sour Skittles 1.15";
        String actual = candy1.toString();

        //Then
        Assert.assertEquals("Construct Test", expected, actual);
    }

    @Test
    public void MessageTest() {
        //Given
        Candy candy =  new Candy();

        //When
        String expected = "Smack Smack, Yum!";
        String actual = candy.message();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
