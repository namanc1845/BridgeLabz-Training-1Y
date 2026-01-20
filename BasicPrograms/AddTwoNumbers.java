import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = myObj.nextDouble();
		System.out.print("Enter second number: ");
        double num2 = myObj.nextDouble();
		double sum = num1 + num2;
		System.out.println("The sum is: " + sum);
        myObj.close();
    }
}