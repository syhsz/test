package org.example.part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main( String[] args ) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = s.nextInt();
        System.out.println("请输入一个计算符号(+-*/)：");
        String operation = s.next();
        System.out.println("请再输入一个整数：");
        int j = s.nextInt();
        String str = i + operation + j + "=";
        int result = 0;
        if (operation.equals("+")){
            result = addition(i, j);
        }
        else if (operation.equals("-")) {
            result = subtraction(i, j);
        }
        else if (operation.equals("*")) {
            result = multiplication(i, j);
        }
        else if (operation.equals("/")) {
            result = division(i, j);
        }
        else {
            System.out.println("Invalid operation");
        }

        System.out.println(str + result);

        s.close();
    }


    public static int addition(int i, int j) {
        int sum = i + j;
        return sum;
        }

    public static int subtraction(int i, int j) {
        int sub = i - j;
        return sub;
    }

    public static int multiplication(int i, int j){
        int mul = i * j;
        return mul;
    }

    public static int division(int i, int j){
        int div = i / j;
        return div;
    }
}
