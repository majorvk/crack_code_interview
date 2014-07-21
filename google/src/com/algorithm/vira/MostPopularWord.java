package com.algorithm.vira;

/**
 * Created by Viktar on 7/15/2014.
 */
public class MostPopularWord {
    public static void main(String... args)
    {
        String[] array ={"a","b","a","c","c","b","b"};
        System.out.print(getPopular(array));
    }

    public static String getPopular(String[] array)
    {
        if(array.length == 0)
            return null;
        String popular = array[0];
        int counter=1;
        for(int i=0;i<array.length;++i)
        {

        }
        System.out.print(counter + " times");
        return popular;
    }
}
