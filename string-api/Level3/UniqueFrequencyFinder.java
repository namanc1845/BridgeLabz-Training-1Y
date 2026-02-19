package com.gla.String.Level3;

import java.util.Scanner;

public class UniqueFrequencyFinder {

    public static int getLength(String text) {

        int i = 0;

        try {
            while (true) {
                text.charAt(i);
                i++;
            }
        } catch (Exception e) {
        }

        return i;
    }

    public static char[] uniqueCharacters(String text) {

        int len = getLength(text);

        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {

            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }

        char[] unique = new char[count];

        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    public static String[][] findFrequency(String text) {

        int len = getLength(text);

        int[] freq = new int[256];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            char ch = unique[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Character\tFrequency");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    data[i][0] + "\t\t" +
                            Integer.parseInt(data[i][1])
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        display(result);
    }
}

