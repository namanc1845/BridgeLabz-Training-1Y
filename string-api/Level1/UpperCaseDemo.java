package com.gla.String.Level1;

import java.util.Scanner;

public class UpperCaseDemo {

    public static String toUpperManual(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String manual = toUpperManual(text);
        String builtIn = text.toUpperCase();

        System.out.println(manual);
        System.out.println(builtIn);
        System.out.println("Same? " + compare(manual, builtIn));
    }
}

