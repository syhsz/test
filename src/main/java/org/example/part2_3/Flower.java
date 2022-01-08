package org.example.part2_3;

public class Flower {
    String name;
    int price;
    int num;

    public Flower (String name, int price, int num){
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public void SetName (String name) {
        this.name=name;
    }

    public void SetWeight (int price) {
        this.price=price;
    }

    public void SetNum (int num){
        this.num=num;
    }

    public int CalculatePrice(){
        int total = price * num;
        return total;
    }

}
