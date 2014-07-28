package com.algorithm.chapter8;

import java.util.Stack;

/**
 * Created by Viktar_Korshun on 7/24/2014.
 */
public class CheckValidParenthesis
{
    public static void main(String... args)
    {
        System.out.print(checkParenthesis2Types("({)}"));
    }

    private static boolean checkParenthesis2Types(String buffer)
    {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<buffer.length();i++)
        {
            if(buffer.charAt(i)=='('||buffer.charAt(i)=='{')
            {
                stack.push(buffer.charAt(i));
            }
            else if(buffer.charAt(i)=='}')
            {
                if (stack.pop() !='{' ) {
                    return false;
                }
            }
            else if(buffer.charAt(i)==')')
            {
                if (stack.pop() !='(' ) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkParenthesisOneType(String buffer)
    {
        int left=0;
        int right=0;
        for (int i=0;i<buffer.length();i++)
        {
            if (right>left)
            {
                return false;
            }
            if (buffer.charAt(i)==')')
            {
                right++;
            }
            else if(buffer.charAt(i)=='(')
            {
                left++;
            }
        }
        return true;
    }
}
