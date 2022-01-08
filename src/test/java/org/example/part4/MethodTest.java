package org.example.part4;

import org.example.part2_3.Flower;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class MethodTest {
    @Test
    public void TestCalculateFlower(){
        int totalPrice = 0;
        ArrayList<Flower> listFlowerBasket;
        ReadFlowerBasket flowerOrder =  new ReadJSON("src\\main\\resources\\FlowerList.json");
        listFlowerBasket = flowerOrder.ReadFlowersList();
        for (Flower flower : listFlowerBasket) totalPrice += flower.CalculatePrice();
        //System.out.printf("The total price of a bouquet of flowers: %d%n", totalPrice);
        Assert.assertEquals(totalPrice,220);
    }
}
