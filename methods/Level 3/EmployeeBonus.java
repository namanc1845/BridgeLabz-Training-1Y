package com.gla.Methods.Level3;

public class EmployeeBonus {

    public static double[][] generateEmployeeData(int size) {

        double[][] data = new double[size][2];

        for (int i = 0; i < size; i++) {

            int salary = (int) (Math.random() * 90000) + 10000;
            int yearsOfService = (int) (Math.random() * 11);

            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }

        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] data) {

        double[][] updatedData = new double[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            updatedData[i][0] = salary;
            updatedData[i][1] = years;
            updatedData[i][2] = bonus;
            updatedData[i][3] = newSalary;
        }

        return updatedData;
    }

    public static void displaySummary(double[][] updatedData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < updatedData.length; i++) {

            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][2];
            totalNewSalary += updatedData[i][3];

            System.out.println((i + 1) + "\t" +
                    updatedData[i][0] + "\t\t" +
                    (int) updatedData[i][1] + "\t" +
                    updatedData[i][2] + "\t" +
                    updatedData[i][3]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {

        int numberOfEmployees = 10;

        double[][] employeeData = generateEmployeeData(numberOfEmployees);

        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        displaySummary(updatedData);
    }
}
