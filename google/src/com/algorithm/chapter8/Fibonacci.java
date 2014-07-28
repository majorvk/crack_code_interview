package com.algorithm.chapter8;

/**
 * Created by Viktar_Korshun on 7/24/2014.
 */
public class Fibonacci
{
    public static void main(String... args)
    {
        System.out.println(findFibonacci(10));
    }

    private static int findFibonacci(int n)
    {
        if (n==0)
        {
            return 0;
        }
        if (n==1)
        {
            return 1;
        }
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
}
