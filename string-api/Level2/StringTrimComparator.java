package com.gla.String.Level2;

import java.util.Scanner;

public class StringTrimComparator {

    public static int[] findTrimIndexes(String text) {

        int len = 0;

        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }

        int start = 0;
        int end = len - 1;

        while (start < len && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String makeSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String s1, String s2) {

        int len1 = 0;
        int len2 = 0;

        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (Exception e) {
        }

        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (Exception e) {
        }

        if (len1 != len2)
            return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);

        String manualTrim = makeSubstring(text, indexes[0], indexes[1]);

        String builtinTrim = text.trim();

        boolean result = compareStrings(manualTrim, builtinTrim);

        System.out.println("Manual Trim : " + manualTrim);
        System.out.println("Built-in Trim : " + builtinTrim);
        System.out.println("Both are Equal : " + result);
    }
}

