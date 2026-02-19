package com.gla.Methods.Level3;

import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateScores(int numberOfStudents) {

        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {

        int n = scores.length;
        double[][] results = new double[n][3];

        for (int i = 0; i < n; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    public static String getGrade(double percentage) {

        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }

    public static void displayScoreCard(int[][] scores, double[][] results) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {

            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t" +
                    getGrade(results[i][2]));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int[][] scores = generateScores(numberOfStudents);
        double[][] results = calculateResults(scores);

        displayScoreCard(scores, results);

        sc.close();
    }
}
