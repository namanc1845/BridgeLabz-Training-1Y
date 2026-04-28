package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class MostFrequentChar {

    static char mostFrequent(String s) {
        int max = 0;
        char res = ' ';

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }

            if (count > max) {
                max = count;
                res = s.charAt(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(mostFrequent(s));
    }
}

