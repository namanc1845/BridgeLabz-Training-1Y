package com.gla.Methods.Level3;

import java.util.Scanner;

public class NumberChecker2 {

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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        return sum;
    }

    public static double sumOfSquares(int[] digits) {
        double sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }

        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);

        if (sum == 0) {
            return false;
        }

        return number % sum == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = getDigits(number);

        System.out.println("Count of digits: " + count);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        int[][] frequency = findDigitFrequency(digits);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " -> " + frequency[i][1]);
            }
        }

        sc.close();
    }
}
