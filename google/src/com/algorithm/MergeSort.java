package com.algorithm;

import java.util.Arrays;

/**
 * Created by Viktar on 7/12/2014.
 */
public class MergeSort {

    public static void main(String[] args) {
        Integer[] array = {1,3,2,5,8,9,4,2,11,67,43,0};
        mergeSort(array);
        for (int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }

    }

    public static void merge(Integer[] array, Integer[] left, Integer[] right)
    {
        int total = left.length + right.length;
        int i=0, j=0, index=0;
        while (index<=total)
        {
            if (i<left.length && j<right.length)
            {
                if (left[i]< right[j])
                {
                    array[index++] = left[i++];
                }
                else
                {
                    array[index++] = right[j++];
                }
            }
            else
            {
                if (i>=left.length)
                {
                    while (j<right.length)
                    {
                        array[index++] = right[j++];
                    }
                }
                if (j>=right.length)
                {
                    while (i<left.length)
                    {
                        array[index++] = left[i++];
                    }
                }
                return;
            }
        }
    }

    public static void mergeSort(Integer[] array)
    {
        if (array.length > 1)
        {
            int index = array.length >> 1;
            Integer[] left = Arrays.copyOfRange(array, 0, index);
            Integer[] right = Arrays.copyOfRange(array, index, array.length);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }
}
