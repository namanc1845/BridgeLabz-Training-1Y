package com.gla.String.Level3;

import java.util.Scanner;

public class CharacterFrequencyFinder {

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

    public static String[][] findFrequency(String text) {

        int len = getLength(text);

        int[] freq = new int[256];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int count = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                count++;
        }

        String[][] result = new String[count][2];

        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char)i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
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

