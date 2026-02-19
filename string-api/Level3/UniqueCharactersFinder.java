package com.gla.String.Level3;

import java.util.Scanner;

public class UniqueCharactersFinder {

    public static int getLength(String text) {

        int i = 0;

        try {
            while (true) {
                text.charAt(i);
                i++;
            }
        } catch (Exception e) {
        }

        return i;
    }

    public static char[] findUnique(String text) {

        int len = getLength(text);

        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {

            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }

        char[] unique = new char[count];

        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    public static void display(char[] arr) {

        System.out.println("Unique Characters:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] result = findUnique(text);

        display(result);
    }
}

