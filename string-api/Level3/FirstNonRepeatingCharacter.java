package com.gla.String.Level3;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

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

    public static char findFirstNonRepeating(String text) {

        int len = getLength(text);

        int[] freq = new int[256];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if (result == '\0')
            System.out.println("No Non-Repeating Character Found");
        else
            System.out.println("First Non-Repeating Character : " + result);
    }
}

