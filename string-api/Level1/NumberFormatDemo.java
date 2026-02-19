package com.gla.String.Level1;

import java.util.Scanner;

public class NumberFormatDemo {

    public static void generate(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    public static void handle(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        } catch (RuntimeException e) {
            System.out.println("Runtime exception handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();


        handle(text);
    }
}
