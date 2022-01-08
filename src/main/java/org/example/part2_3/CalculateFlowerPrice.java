package org.example.part2_3;

import org.example.part4.ReadFlowerBasket;
import org.example.part4.ReadJSON;

import java.util.ArrayList;
import java.util.HashMap;

public class CalculateFlowerPrice {
    public static void main(String[] args) {
        HashMap<String, Integer> stockMap = new HashMap<>();
        ArrayList<Flower> listFlowerBasket;
        int totalPrice = 0;
        String stockFilePath = "src\\main\\resources\\Stock.txt";
        String basketFilePath = "src\\main\\resources\\FlowerOrder.txt";
        //String basketFilePath = "src\\main\\resources\\FlowerList.json";

        try {
            ArrayList<String[]> stockList = new ReadTxtToString(stockFilePath).Read();
            for (String[] s : stockList) {
                String name = s[0];
                int num = Integer.parseInt(s[1]);
                stockMap.put(name, num);
            }

            ReadFlowerBasket flowerOrder = new ReadTXT(basketFilePath);
            listFlowerBasket = flowerOrder.ReadFlowersList();
            for (Flower flower : listFlowerBasket) {
                if (flower.num > stockMap.get(flower.name)) {
                    throw new OutOfStockException();
                } else if ((flower.price < 0) | (flower.num < 0)) {
                    throw new InvalidValueException();
                }
                totalPrice += flower.CalculatePrice();
            }
            System.out.printf("The total price of a bouquet of flowers: %d%n", totalPrice);
        } catch (NumberFormatException | StringIndexOutOfBoundsException | InvalidValueException | OutOfStockException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


       /* try {
            //Get stock into hashmap
            ArrayList<String> stockList = ReadFromFile("src\\Stock.txt");
            for (String line : stockList) {
                String name = line.substring(0, line.indexOf(' '));
                String stockNum = line.substring(line.indexOf(' ') + 1);
                Integer num = Integer.parseInt(stockNum);
                stockMap.put(name, num);
            }
        }catch(NumberFormatException e){
            e.printStackTrace();
        }

        try {
            //Get flower order into arraylist
            ArrayList<String> orderFlowerList = ReadFromFile("src\\OrderFlower.txt");
            for (String line : orderFlowerList) {
                line = line.trim();
                int index1 = line.indexOf(' ');
                int index2 = line.indexOf(' ',index1+1);
                String name = line.substring(0, index1);
                String stringPrice = line.substring(index1 + 1, index2);
                String stringNum = line.substring(index2 + 1);
                int price = Integer.parseInt(stringPrice);
                int num = Integer.parseInt(stringNum);

                if (price <0 | num <0) {
                    throw new InvalidValueException();
                }
                if (num > stockMap.get(name)) {
                    throw new OutOfStockException();
                }

                Flower flower;
                if (name.equals("SunFlower")) {
                    flower = new FlowerWithDiscount(name, price, num);
                } else {
                    flower = new Flower(name,price,num);
                    }
                flowerBasket.add(flower);
            }
        } catch (OutOfStockException | InvalidValueException | StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        //Calculate the price of a bouquet of flowers
        for (Flower flower : flowerBasket) totalPrice += flower.CalculatePrice();
        System.out.printf("The total price of a bouquet of flowers: %d%n", totalPrice);
    }


    @NotNull
    public static ArrayList<String> ReadFromFile (String filePath) {
        ArrayList<String> list =  new ArrayList<>();
        try {
            File file = new File (filePath);
            FileReader reader =  new FileReader(file);
            BufferedReader bf = new BufferedReader(reader);
            String line;
            while ((line=bf.readLine()) != null) {
                list.add(line);
            }
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }*/


    }
}
