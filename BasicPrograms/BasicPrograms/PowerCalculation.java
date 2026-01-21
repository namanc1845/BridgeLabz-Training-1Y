import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double exponent = input.nextDouble();
        System.out.println(Math.pow(base, exponent));
    }
}