import java.util.*;

public class BMI2DMethods {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double heightM = data[i][1] / 100.0;
            data[i][2] = data[i][0] / (heightM * heightM);
        }
    }

    public static String[] findStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);
        String[] status = findStatus(data);

        for (int i = 0; i < 10; i++)
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + status[i]);
    }
}