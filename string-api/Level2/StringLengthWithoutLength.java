package com.gla.String.Level2;

import java.util.Scanner;

public class StringLengthWithoutLength {
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        }
        catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = findLength(input);
        int actualLength = input.length();

        System.out.println("Length (Without length() method): " + customLength);
        System.out.println("Length (Using length() method): " + actualLength);
    }
}
