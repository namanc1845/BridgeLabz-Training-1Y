package com.gla.String.Level2;

import java.util.Scanner;

public class TextWordAnalyzer {

    public static int getLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
        }
        return i;
    }

    public static String[] splitText(String text) {
        int len = getLength(text);
        String temp = "";
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!temp.equals("")) {
                    count++;
                    temp = "";
                }
            } else {
                temp = temp + ch;
            }
        }
        if (!temp.equals(""))
            count++;

        String[] words = new String[count];
        temp = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!temp.equals("")) {
                    words[index] = temp;
                    index++;
                    temp = "";
                }
            } else {
                temp = temp + ch;
            }
        }
        if (!temp.equals(""))
            words[index] = temp;

        return words;
    }

    public static String[][] make2D(String[] words) {
        int n = words.length;
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = words[i];
            int l = getLength(words[i]);
            arr[i][1] = String.valueOf(l);
        }

        return arr;
    }

    public static int[] findShortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }

            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = make2D(words);
        int[] result = findShortestLongest(data);

        System.out.println("Shortest Word : " + data[result[0]][0]);
        System.out.println("Length : " + Integer.parseInt(data[result[0]][1]));

        System.out.println("Longest Word : " + data[result[1]][0]);
        System.out.println("Length : " + Integer.parseInt(data[result[1]][1]));
    }
}

