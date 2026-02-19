package com.gla.Methods.Level3;

import java.util.Scanner;

public class FactorOperations {

    public static int[] findFactors(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int findSum(int[] factors) {

        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }

        return sum;
    }

    public static int findProduct(int[] factors) {

        int product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }

        return product;
    }

    public static double findProductOfCubes(int[] factors) {

        double product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println();
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSum(factors));
        System.out.println("Product of Factors: " + findProduct(factors));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubes(factors));

        sc.close();
    }
}
