import java.util.Scanner;

public class AverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        System.out.println((n1 + n2 + n3) / 3);
    }
}