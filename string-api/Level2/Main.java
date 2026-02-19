package com.gla.String.Level2;

import java.util.Scanner;

public class Main {

    public static int getLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
        }
        return i;
    }

    public static String[] splitText(String text) {
        int len = getLength(text);
        String temp = "";
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!temp.equals("")) {
                    count++;
                    temp = "";
                }
            } else {
                temp = temp + ch;
            }
        }
        if (!temp.equals(""))
            count++;

        String[] words = new String[count];
        temp = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!temp.equals("")) {
                    words[index] = temp;
                    index++;
                    temp = "";
                }
            } else {
                temp = temp + ch;
            }
        }
        if (!temp.equals(""))
            words[index] = temp;

        return words;
    }

    public static String[][] make2D(String[] words) {
        int n = words.length;
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = words[i];
            int l = getLength(words[i]);
            arr[i][1] = String.valueOf(l);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] result = make2D(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < result.length; i++) {
            String word = result[i][0];
            int length = Integer.parseInt(result[i][1]);
            System.out.println(word + "\t" + length);
        }
    }
}

