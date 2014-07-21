package com.algorithm.chapter1;

/**
 * Created by Viktar on 7/20/2014.
 */
public class RotateMatrix {
    public static void main(String... args)
    {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotateMatrix(matrix);
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+ ",");
            }
            System.out.println();
        }

    }
    public static void rotateMatrix(int[][] matrix)
    {
        int length = matrix.length;
        int layerCount=length/2;
        for(int layer=0;layer<layerCount;layer++)
        {
            int last= length -1-layer;
            for(int j=layer;j< last;j++)
            {
                int offset=j-layer;
                int top = matrix[layer][j];
                // left -> top
                matrix[layer][j] = matrix[last-offset][layer];
                // bottom -> left
                matrix[last-offset][layer] = matrix[last][last - offset];
                // right -> bottom
                matrix[last][last - offset] = matrix[j][last];
                // top -> right
                matrix[j][last] = top;
            }
        }
    }
}
