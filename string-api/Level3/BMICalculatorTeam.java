package com.gla.String.Level3;

import java.util.Scanner;

public class BMICalculatorTeam {

    public static double[][] getInput(int n) {

        Scanner sc = new Scanner(System.in);
        double[][] data = new double[n][2];

        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        return data;
    }

    public static String[] calculateBMIStatus(double weight, double heightCm) {

        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{String.valueOf(bmi), status};
    }

    public static String[][] processBMI(double[][] data) {

        int n = data.length;
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiData = calculateBMIStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }

        return result;
    }

    public static void display(String[][] result) {

        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" +
                            result[i][1] + "\t\t" +
                            result[i][2] + "\t" +
                            result[i][3]
            );
        }
    }

    public static void main(String[] args) {

        int n = 10;

        double[][] input = getInput(n);

        String[][] result = processBMI(input);

        display(result);
    }
}

