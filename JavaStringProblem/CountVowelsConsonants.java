package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class CountVowelsConsonants {

    static int[] count(String s) {
        int v = 0, c = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1)
                    v++;
                else
                    c++;
            }
        }

        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] res = count(s);

        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}

