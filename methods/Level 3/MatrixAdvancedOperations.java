package com.gla.Methods.Level3;

public class MatrixAdvancedOperations {

    public static int[][] createRandomMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] -
               matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] m) {

        int det =
                m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
                m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
                m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        return det;
    }

    public static double[][] inverse2x2(int[][] matrix) {

        int det = determinant2x2(matrix);

        if (det == 0) {
            return null;
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;

        return inverse;
    }

    public static double[][] inverse3x3(int[][] m) {

        int det = determinant3x3(m);

        if (det == 0) {
            return null;
        }

        double[][] adj = new double[3][3];

        adj[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        adj[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[0][2] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        adj[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        adj[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        adj[2][0] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        adj[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        adj[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        double[][] inverse = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[j][i] / det;
            }
        }

        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {

        if (matrix == null) {
            System.out.println("Inverse does not exist (Determinant is 0).");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix2x2 = createRandomMatrix(2, 2);
        int[][] matrix3x3 = createRandomMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("Transpose of 2x2:");
        displayMatrix(transpose(matrix2x2));

        System.out.println("Determinant (2x2): " + determinant2x2(matrix2x2));

        System.out.println("Inverse (2x2):");
        displayMatrix(inverse2x2(matrix2x2));

        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("Transpose of 3x3:");
        displayMatrix(transpose(matrix3x3));

        System.out.println("Determinant (3x3): " + determinant3x3(matrix3x3));

        System.out.println("Inverse (3x3):");
        displayMatrix(inverse3x3(matrix3x3));
    }
}
