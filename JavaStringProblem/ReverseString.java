package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class ReverseString {

    static String reverse(String s) {
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(reverse(s));
    }
}

