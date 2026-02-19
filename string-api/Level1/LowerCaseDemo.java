package com.gla.String.Level1;

import java.util.Scanner;

public class LowerCaseDemo {

    public static String toLowerManual(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String manual = toLowerManual(text);
        String builtIn = text.toLowerCase();

        System.out.println(manual);
        System.out.println(builtIn);
        System.out.println("Same? " + manual.equals(builtIn));
    }
}

