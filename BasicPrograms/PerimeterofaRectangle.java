import java.util.Scanner;

public class PerimeterofaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println(perimeter);
    }
}