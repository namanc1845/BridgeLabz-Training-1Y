package com.gla.String.BuiltInFunctionProblems;

import java.util.Scanner;

public class BasicCalculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("1.Add 2.Sub 3.Mul 4.Div");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: System.out.println(add(a, b)); break;
            case 2: System.out.println(sub(a, b)); break;
            case 3: System.out.println(mul(a, b)); break;
            case 4: System.out.println(div(a, b)); break;
        }
    }
}

