package com.gla.String.Level2;

import java.util.Scanner;

public class CharacterTypeAnalyzer {

    public static String checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeString(String text) {

        int len = 0;

        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }

        String[][] data = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            data[i][0] = String.valueOf(ch);
            data[i][1] = checkChar(ch);
        }

        return data;
    }

    public static void display(String[][] data) {

        System.out.println("Character\tType");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = analyzeString(text);

        display(result);
    }
}

