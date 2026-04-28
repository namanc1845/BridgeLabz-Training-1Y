package com.gla.String.BuiltInFunctionProblems;

import java.util.Scanner;

public class PalindromeChecker {

    static String takeInput(Scanner sc) {
        System.out.print("Enter string: ");
        return sc.nextLine();
    }

    static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
    }

    static void displayResult(boolean result) {
        if (result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = takeInput(sc);
        boolean res = isPalindrome(s);
        displayResult(res);
    }
}

