package com.gla.String.BuiltInFunctionProblems;

import java.util.Scanner;

public class MaxOfThree {

    static int[] takeInput(Scanner sc) {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int[] nums = takeInput(sc);

        int max = findMax(nums[0], nums[1], nums[2]);
        System.out.println("Maximum: " + max);
    }
}
