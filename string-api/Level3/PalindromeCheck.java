package com.gla.String.Level3;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean palindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean palindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return palindromeRecursive(text, start + 1, end - 1);
    }

    public static char[] reverseArray(String text) {
        char[] reverse = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }
        return reverse;
    }

    public static boolean palindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseArray(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = palindromeLogic1(text);
        boolean result2 = palindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = palindromeLogic3(text);

        System.out.println("Logic 1 Result: " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 Result: " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 Result: " + (result3 ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}

