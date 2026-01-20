import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = input.nextDouble();

        System.out.print("Enter Rate: ");
        double r = input.nextDouble();

        System.out.print("Enter Time: ");
        double t = input.nextDouble();

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest: " + si);
        System.out.println("Total Amount: " + (p + si));

        input.close();
    }
}