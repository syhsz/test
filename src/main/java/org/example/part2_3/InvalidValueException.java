package org.example.part2_3;

public class InvalidValueException extends Exception{
    InvalidValueException() {
        super();
    }

    @Override
    public void printStackTrace() {
        System.out.println("InvalidValueException");
    }
}
