package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class LongestWord {

    static String findLongest(String s) {
        String[] words = s.split(" ");
        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length())
                longest = w;
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(findLongest(s));
    }
}

