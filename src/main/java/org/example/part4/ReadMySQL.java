package org.example.part4;

import org.example.part2_3.Flower;
import org.example.part2_3.FlowerWithDiscount;

import java.sql.*;
import java.util.ArrayList;

public class ReadMySQL implements ReadFlowerBasket {
    String url;
    String user;
    String password;

    public ReadMySQL(String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public ArrayList<Flower> ReadFlowersList(){
        ArrayList<Flower> listFlowerBasket = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "select * from table";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int num = resultSet.getInt("num");
                Flower flower;
                if (name.equals("SunFlower")) {
                    flower = new FlowerWithDiscount(name, price, num);
                } else {
                    flower = new Flower(name,price,num);
                }
                listFlowerBasket.add(flower);
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
        return listFlowerBasket;

    }
}
