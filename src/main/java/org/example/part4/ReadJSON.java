package org.example.part4;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.example.part2_3.Flower;
import org.example.part2_3.FlowerWithDiscount;

import java.io.*;
import java.util.ArrayList;

public class ReadJSON implements ReadFlowerBasket {
    String filePath;

    public ReadJSON(String filePath){
        this.filePath = filePath;
    }

    public ArrayList<Flower> ReadFlowersList() {
        ArrayList<Flower> listFlowerBasket = new ArrayList<>();
        try {
            File file = new File(filePath);
            FileReader reader = new FileReader(file);
            BufferedReader bf = new BufferedReader(reader);
            StringBuilder jsonStr = new StringBuilder();
            String line;
            while ((line = bf.readLine()) != null) {
                jsonStr.append(line);
            }
            bf.close();
            JSONObject jsonObj = (JSONObject) JSON.parse(jsonStr.toString());
            JSONArray jsonArrayFlower = jsonObj.getJSONArray("Flowers");
            for (int i=0; i<jsonArrayFlower.size(); i++){
                String name = jsonArrayFlower.getJSONObject(i).getString("name");
                int price = jsonArrayFlower.getJSONObject(i).getIntValue("price");
                int num = jsonArrayFlower.getJSONObject(i).getIntValue("num");
                Flower flower;
                if (name.equals("SunFlower")) {
                    flower = new FlowerWithDiscount(name, price, num);
                } else {
                    flower = new Flower(name,price,num);
                }
                listFlowerBasket.add(flower);
            }
        }catch (NullPointerException | IOException e) {
            e.printStackTrace();
            return null;
        }
        return listFlowerBasket;
    }
}
