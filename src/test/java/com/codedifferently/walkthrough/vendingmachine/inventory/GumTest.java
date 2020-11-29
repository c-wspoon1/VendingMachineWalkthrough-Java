package com.codedifferently.walkthrough.vendingmachine.inventory;

    import org.junit.Assert;
    import org.junit.Test;

public class GumTest {

    @Test
    public void constructorTest(){
        // Given
        String name = "Rhino Chew";
        Double price = 0.00;
        Gum gumRef = new Gum(name, price);

        // When
        String expected = name + " " + price;
        String actual = gumRef.toString();
        // Then
        Assert.assertEquals("Constructor test",expected, actual);
    }


    @Test
    public void messageTest(){
        //Given
        Gum gum = new Gum();

        // When
        String expected = "Chew Chew, Yum!";
        String actual = gum.message();

        // Then

        Assert.assertEquals(expected, actual);
    }
}
