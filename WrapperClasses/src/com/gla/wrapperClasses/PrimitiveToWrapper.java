package com.gla.wrapperClasses;

import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        Integer obj = num;
        System.out.println("Primitive int value: " + num);
        System.out.println("Wrapper Integer object value: " + obj);
        sc.close();
    }
}
