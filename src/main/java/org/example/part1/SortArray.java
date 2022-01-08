package org.example.part1;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class SortArray {
    public static void main( String[] args ){
        //Randomly generate an array of length between 5~10
        Random random = new Random();
        int length = random.nextInt(10)+5;
        System.out.print("Original array: ");
        String[] stringArray = new String[length];
        for (int i = 0; i < length; i++) {
            stringArray[i] = GenerateRandomString();
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();

        System.out.print("Ordered array: ");
        String[] sortedStringArray = SortStringArray(stringArray);
        for (int i = 0; i < length; i++) {
            System.out.print(sortedStringArray[i] + " ");
        }
        System.out.println();
    }

    //Randomly generate String of length within 10
    @NotNull
    public static String GenerateRandomString(){
        StringBuilder randomString = new StringBuilder();
        String str = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ1234567890";
        int length = str.length();
        Random random = new Random();
        int randomLength = random.nextInt(10);
        for (int i = 0; i < randomLength; i++) {
            char ch = str.charAt(random.nextInt(length));
            randomString.append(ch);
        }
        return randomString.toString();
    }

    //Sort array by string length
    public static String[] SortStringArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length-1; i++) {
            for (int j = i+1; j < stringArray.length; j++) {
                if (stringArray[i].length() < stringArray[j].length()) {
                    String temp = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                }
            }
        }
        return stringArray;
    }
}
