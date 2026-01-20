import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilometers = input.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(miles);
    }
}