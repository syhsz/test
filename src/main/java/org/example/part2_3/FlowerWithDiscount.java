package org.example.part2_3;

public class FlowerWithDiscount extends Flower{

    public FlowerWithDiscount(String name, int price, int num){
        super(name, price, num);
    }

    public int CalculatePrice(){
        // 1 flower reduction for every 5 flowers
        int RealNum = num - num/5;
        int total = price * RealNum;
        return total;
    }
}
