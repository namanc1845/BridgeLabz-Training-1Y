package com.gla.String.Level2;

import java.util.Scanner;

public class StudentVotingEligibility {

    public static int[] getAges(int n) {

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    public static String[][] checkVoting(int[] ages) {

        int n = ages.length;
        String[][] data = new String[n][2];

        for (int i = 0; i < n; i++) {

            int age = ages[i];
            data[i][0] = String.valueOf(age);

            if (age < 0) {
                data[i][1] = "false";
            }
            else if (age >= 18) {
                data[i][1] = "true";
            }
            else {
                data[i][1] = "false";
            }
        }

        return data;
    }

    public static void display(String[][] data) {

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        int n = 10;

        int[] ages = getAges(n);

        String[][] result = checkVoting(ages);

        display(result);
    }
}

