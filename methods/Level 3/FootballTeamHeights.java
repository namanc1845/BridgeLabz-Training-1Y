package com.gla.Methods.Level3;

public class FootballTeamHeights {

    public static int[] generateHeights(int size) {

        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }

        return heights;
    }

    public static int findSum(int[] heights) {

        int sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {

        int min = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }

        return min;
    }

    public static int findTallest(int[] heights) {

        int max = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        System.out.println("Player Heights (in cm):");

        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Mean Height: " + findMean(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
    }
}
