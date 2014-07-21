package com.algorithm.vira;

/**
 * Created by Viktar on 7/15/2014.
 */
public class MaxSumSearch {
    public static void main(String... args)
    {
        int[] array ={1,2,3,-7,5};
        System.out.print(calcMaxSum(array));
    }

    public static int calcMaxSum(int[] array)
    {
        if(array.length == 0)
            return 0;
        int maxSum = 0, sum = 0;
        for(int i=0;i<array.length;i++)
        {
            sum += array[i];
            maxSum = Math.max(maxSum, sum);
            sum = Math.max(sum, 0);
        }
        return maxSum;
    }
}
