package com.gla.String.Level1;

import java.util.Scanner;

public class SubstringDemo {

    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Start index: ");
        int start = sc.nextInt();

        System.out.print("End index: ");
        int end = sc.nextInt();

        String userSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("charAt() Substring: " + userSub);
        System.out.println("substring(): " + builtInSub);
        System.out.println("Both same? " + compareStrings(userSub, builtInSub));
    }
}
