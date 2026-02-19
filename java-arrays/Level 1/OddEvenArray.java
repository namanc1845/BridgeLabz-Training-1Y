import java.util.*;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];
        int eIndex = 0, oIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[eIndex++] = i;
            } else {
                odd[oIndex++] = i;
            }
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < oIndex; i++)
            System.out.print(odd[i] + " ");

        System.out.println("\nEven numbers:");
        for (int i = 0; i < eIndex; i++)
            System.out.print(even[i] + " ");
    }
}