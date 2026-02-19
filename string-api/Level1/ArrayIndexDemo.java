package com.gla.String.Level1;

public class ArrayIndexDemo {

    public static void generate(String[] arr) {
        System.out.println(arr[10]);
    }

    public static void handle(String[] arr) {
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds handled!");
        }
    }

    public static void main(String[] args) {
        String[] names = {"Aman", "Riya", "Raj"};

        handle(names);
    }
}

