package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class RemoveCharacter {

    static String removeChar(String s, char ch) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch)
                res += s.charAt(i);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.println(removeChar(s, ch));
    }
}

