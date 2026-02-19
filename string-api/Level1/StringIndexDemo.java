package com.gla.String.Level1;

import java.util.Scanner;

public class StringIndexDemo {

    public static void generate(String text) {
        System.out.println(text.charAt(100));
    }

    public static void handle(String text) {
        try {
            System.out.println(text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generate(text);
        handle(text);
    }
}

