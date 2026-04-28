package com.gla.String.BuiltInFunctionProblems;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }

    static String getFeedback(Scanner sc, int guess) {
        System.out.println("Computer guess: " + guess);
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1, high = 100;

        while (true) {
            int guess = generateGuess(low, high);
            String feedback = getFeedback(sc, guess);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed correctly");
                break;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }
}
