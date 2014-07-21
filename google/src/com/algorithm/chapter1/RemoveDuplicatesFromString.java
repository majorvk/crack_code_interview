package com.algorithm.chapter1;

public class RemoveDuplicatesFromString {
    public static void main(String... args)
    {
        char[] array ={'a','b','a','k','c','v','b','l'};
        removeDuplicates2(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
        }
    }

    private static void removeDuplicates(char[] array) {
        QuickSort.quickSort(array);
        int index=1;
        char prev = array[0];
        for(int i=1;i<array.length;i++)
        {
            if(prev != array[i])
            {
                array[index]=array[i];
                ++index;
                prev=array[i];
            }
        }
        for(int i=index;i<array.length;i++)
        {
            array[i]=0;
        }
    }

    private static void removeDuplicates2(char[] array) {

        boolean[] buf = new boolean[256];
        for(int i=0;i<array.length;i++)
        {
            if(buf[array[i]])
            {
                array[i]=0;
            }
            else
            {
                buf[array[i]]=true;
            }
        }
    }
}