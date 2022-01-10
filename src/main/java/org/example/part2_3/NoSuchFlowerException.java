package org.example.part2_3;

public class NoSuchFlowerException extends Exception{

    String name;

    NoSuchFlowerException(String name ) {
        super();
        this.name = name;
    }

    public void printStackTrace() {
        System.out.printf("No such flower \"%s\" in stock.", name);
    }
}
