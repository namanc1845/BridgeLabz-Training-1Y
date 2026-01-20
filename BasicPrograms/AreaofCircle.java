import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
    }
}