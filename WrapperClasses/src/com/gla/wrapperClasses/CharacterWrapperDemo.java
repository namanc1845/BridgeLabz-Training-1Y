package com.gla.wrapperClasses;

import java.util.Scanner;

public class CharacterWrapperDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int letters = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isWhitespace(ch)) {
                special++;
            }
        }

        System.out.println("Total letters = " + letters);
        System.out.println("Total digits = " + digits);
        System.out.println("Total special characters = " + special);

        sc.close();
    }
}
