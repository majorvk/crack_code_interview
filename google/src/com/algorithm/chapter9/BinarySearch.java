package com.algorithm.chapter9;

/**
 * Created by Viktar on 7/12/2014.
 */
public class BinarySearch {

    public static void main(String[] args) {
        Integer[] array = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        //Integer[] array = {1, 3, 19, 20, 25, 32, 67, 68, 90, 123, 450, 987};
        System.out.println(search(array, 19));
    }


    public static int search(Integer[] array, int value)
    {
        int middle = array.length >> 1;
        int i=0, end=array.length -1;
        while (i<=end)
        {
            if (middle>=array.length)
            {
                return -1;
            }
            else if (array[middle]==value)
            {
                return middle+1;
            }
            if (array[i] < array[end])
            {
                if (array[middle]<value)
                {
                    i=middle+1;
                }
                else
                {
                    end=middle-1;
                }
            }
            else if (value<array[middle] ) {
                end=middle-1;
            }
            else if (value<=array[end]){
                i=middle+1;
            }
            else
            {
                end=middle-1;
            }

            middle = i+end >> 1;
        }

        return -1;
    }

    public static int binarySearch(Integer[] array, int value)
    {
        int middle = array.length >> 1;
        int i=0, end=array.length;
        while (i<=end)
        {
            if (middle>=array.length)
            {
                return -1;
            }
            else if (array[middle]==value)
            {
                return middle+1;
            }
            if (array[middle]<value)
            {
                i=middle+1;
            }
            else
            {
                end=middle-1;
            }
            middle = i+end >> 1;
        }

        return -1;
    }
}
