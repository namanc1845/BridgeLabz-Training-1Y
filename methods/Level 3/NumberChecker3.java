package com.gla.Methods.Level3;

import java.util.Scanner;

public class NumberChecker3 {

    public static int countDigits(int number) {
        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static int[] getDigits(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Count of digits: " + countDigits(number));

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();

        int[] reversed = reverseArray(digits);

        System.out.print("Reversed Digits: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }

        System.out.println();
        System.out.println("Are original and reversed arrays equal: " + compareArrays(digits, reversed));
        System.out.println("Is Palindrome Number: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        sc.close();
    }
}
