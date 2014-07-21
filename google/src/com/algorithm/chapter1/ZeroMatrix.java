package com.algorithm.chapter1;

/**
 * Created by Viktar on 7/20/2014.
 */
public class ZeroMatrix {
    public static void main(String... args)
    {
        int[][] matrix = {{1,2,0,4},{5,6,7,8},{9,10,11,12},{0,14,15,16}};
        printMatrix(matrix);
        processZeros(matrix);
        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+ ",");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void processZeros(int[][] matrix)
    {
        int[] zeroRows = new int[matrix.length];
        int[] zeroColumns = new int[matrix[0].length];
        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i]++;
                    zeroColumns[j]++;
                }
            }
        }
        for (int i = 0; i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (zeroRows[i] > 0 || zeroColumns[j] > 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

