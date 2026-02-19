package com.gla.String.Level2;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static int[][] generateMarks(int n) {

        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10;
            marks[i][1] = (int)(Math.random() * 90) + 10;
            marks[i][2] = (int)(Math.random() * 90) + 10;
        }

        return marks;
    }

    public static double[][] calculateResult(int[][] marks) {

        int n = marks.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            per = Math.round(per * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = per;
        }

        return result;
    }

    public static String[][] calculateGrade(double[][] result) {

        int n = result.length;
        String[][] grades = new String[n][1];

        for (int i = 0; i < n; i++) {

            double per = result[i][2];

            if (per >= 80)
                grades[i][0] = "A";
            else if (per >= 70)
                grades[i][0] = "B";
            else if (per >= 60)
                grades[i][0] = "C";
            else if (per >= 50)
                grades[i][0] = "D";
            else if (per >= 40)
                grades[i][0] = "E";
            else
                grades[i][0] = "R";
        }

        return grades;
    }

    public static void displayScorecard(int[][] marks, double[][] result, String[][] grades) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPer\tGrade");

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            (int)result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grades[i][0]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        double[][] result = calculateResult(marks);

        String[][] grades = calculateGrade(result);

        displayScorecard(marks, result, grades);
    }
}

