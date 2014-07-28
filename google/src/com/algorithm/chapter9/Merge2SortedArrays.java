package com.algorithm.chapter9;

/**
 * Created by Viktar on 7/28/2014.
 */
public class Merge2SortedArrays {
    public static void main(String args[])
    {
        int[] a1 = new int[10];
        a1[0]=1;a1[1]=7;a1[2]=9;
        int[] a2 = {3,5,6,9};
        sort(a1,a2,3,4);
        for (int i : a1) {
            System.out.println(i);
        }
    }

    private static void sort(int[] a1, int[] a2,int count1,int count2) {

        int i = count1-1;
        int j = count2-1;
        int index=i+j+1;
        while(i>=0&&j>=0)
        {
            if (a1[i]>a2[j])
            {
                a1[index--]=a1[i--];
            }
            else
            {
                a1[index--]=a2[j--];
            }
        }
        while (j>=0)
        {
            a1[index--]=a2[j--];
        }
    }
}
