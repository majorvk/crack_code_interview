package com.algorithm.chapter1;

public class QuickSort {
    public static void main(String... args)
    {
        char[] array ={'a','b','a','k','c','v','b','l'};
        quickSort(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
        }
    }
    public static void quickSort(char[] str) {
        quickSort(str, 0, str.length - 1);
    }

    private static void quickSort(char[] str, int left, int right) {
        int pivotIndex = sort(str, left, right);
        if (left < pivotIndex - 1) {
            quickSort(str, left, pivotIndex - 1);
        }
        if (right > pivotIndex) {
            quickSort(str, pivotIndex, right);
        }
    }

    private static int sort(char[] str, int start, int end) {
        int middle = (start + end) / 2;
        int i = start, j = end;
        while (i <= j) {
            while (str[i] < str[middle]) {
                i++;
            }
            while (str[j] > str[middle]) {
                j--;
            }

            if (i <= j) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
}