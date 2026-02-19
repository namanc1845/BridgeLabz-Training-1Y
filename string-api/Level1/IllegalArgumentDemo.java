package com.gla.String.Level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generate(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handle(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled!");
        } catch (RuntimeException e) {
            System.out.println("Runtime exception handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generate(text);
        handle(text);
    }
}
