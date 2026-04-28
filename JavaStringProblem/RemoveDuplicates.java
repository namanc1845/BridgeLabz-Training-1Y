package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class RemoveDuplicates {

    static String removeDup(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (res.indexOf(ch) == -1)
                res += ch;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(removeDup(s));
    }
}

