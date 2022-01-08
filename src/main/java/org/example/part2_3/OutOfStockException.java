package org.example.part2_3;

public class OutOfStockException extends Exception{
    OutOfStockException() {
        super();
    }

    @Override
    public void printStackTrace() {
        System.out.println("Out of Stock Exception");
    }
}
