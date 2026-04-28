package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class ToggleCase {

    static String toggle(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch))
                res += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch))
                res += Character.toUpperCase(ch);
            else
                res += ch;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(toggle(s));
    }
}

