package com.algorithm.chapter9;

import java.util.Arrays;

/**
 * Created by Viktar on 7/12/2014.
 */
public class SortAnagram {
    public static void main(String[] args) {
        String[] array = {"nna", "nnn", "ann"};
        Arrays.sort(array, new AnagramComparator());
        for (int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

}
