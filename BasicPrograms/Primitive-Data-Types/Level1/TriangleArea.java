import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = input.nextDouble();

        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;

        System.out.println("The area of the triangle is " + areaInches + " sq inches");
        System.out.println("The area of the triangle is " + areaCm + " sq cm");
        
        input.close();
    }
}