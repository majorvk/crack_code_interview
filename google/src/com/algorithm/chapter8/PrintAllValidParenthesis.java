package com.algorithm.chapter8;

/**
 * Created by Viktar_Korshun on 7/24/2014.
 */
public class PrintAllValidParenthesis
{
    public static void main(String... args)
    {
        printParenthesis(5,5,"");
    }

    private static void printParenthesis(int left, int right, String buffer)
    {
        if(right==0)
        {
            System.out.println(buffer);
            return;
        }
        if (left>0)
        {
            printParenthesis(left-1,right, buffer+'(');
            if(left< right)
            {
                printParenthesis(left,right-1, buffer+')');
            }
        }
        else
        {
            printParenthesis(left,right-1, buffer+')');
        }
    }
}
