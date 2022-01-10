package org.example.part2_3;

import org.example.part4.ReadFlowerBasket;

import java.util.ArrayList;

public class ReadTXT implements ReadFlowerBasket {
    String filePath;

    public ReadTXT(String filePath){
        this.filePath = filePath;
    }

    public ArrayList<Flower>  ReadFlowersList(){
        ArrayList<Flower> flowerBasket = new ArrayList<>();
        try{
            ArrayList<String[]> list = new ReadTxtToString(filePath).Read();
            for (String[] s: list) {
                String name = s[0];
                int price = Integer.parseInt(s[1]);
                int num = Integer.parseInt(s[2]);
                Flower flower;
                if (name.equals("SunFlower")) {
                    flower = new FlowerWithDiscount(name, price, num);
                } else {
                    flower = new Flower(name,price,num);
                }
                flowerBasket.add(flower);
            }
        }catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return flowerBasket;
    }
}
