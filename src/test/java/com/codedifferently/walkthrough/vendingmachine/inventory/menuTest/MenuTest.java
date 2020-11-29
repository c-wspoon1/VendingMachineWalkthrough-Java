package com.codedifferently.walkthrough.vendingmachine.inventory.menuTest;

import com.codedifferently.walkthrough.vendingmachine.inventory.menu.Menu;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MenuTest {

    @Test
    public void getOptionsTest(){
        //Given
        ArrayList<String> options = new ArrayList<>();
       options.add("(1) Display Vending Machine Items");
       options.add("(2) Purchase");
       options.add("(3) Exit");
        Menu menu = new Menu(options);

        //When
        int expected = 3;
        ArrayList<String> actualList = menu.getOptions();
        int actual = actualList.size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void DisplayItemsTest(){

    }

    @Test
    public void PurchaseTest(){

    }
}
