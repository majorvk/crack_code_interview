package com.algorithm.chapter1;

/**
 * Created by Viktar on 7/15/2014.
 */
public class CheckAllUniqueCharacters {
    public static void main(String... args)
    {
        String[] array ={"a","b","a","c","c","b","b"};
        System.out.print(checkAllUnique("abcksdl"));
        System.out.print(checkAllUnique("abcksla"));
    }

    public static boolean checkAllUnique(String str)
    {
        char[] strArray=str.toCharArray();
        QuickSort.quickSort(strArray);

        for(int i=0;i<strArray.length-1;++i)
        {
            if(strArray[i] == strArray[i+1])
            {
                return false;
            }
        }
        return true;
    }

}
