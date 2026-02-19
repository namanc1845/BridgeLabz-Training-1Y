package com.gla.String.Level2;

import java.util.Scanner;

public class SplitCompare {

    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static int countWords(String s) {
        int len = findLength(s);
        int words = 1;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                words++;
            }
        }
        return words;
    }

    public static String[] manualSplit(String s) {
        int len = findLength(s);
        int words = countWords(s);

        int[] spaceIndex = new int[words + 1];
        int k = 0;

        spaceIndex[k++] = -1;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }

        spaceIndex[k] = len;

        String[] result = new String[words];

        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += s.charAt(j);
            }
            result[i] = word;
        }

        return result;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        boolean result = compareArrays(manual, builtin);

        System.out.println("Manual Split:");
        for (String w : manual) {
            System.out.println(w);
        }

        System.out.println("Built-in Split:");
        for (String w : builtin) {
            System.out.println(w);
        }

        System.out.println("Both are same: " + result);
    }
}

