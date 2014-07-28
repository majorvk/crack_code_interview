package com.algorithm.chapter3;

import java.util.Stack;

/**
 * Created by Viktar_Korshun on 7/22/2014.
 */
public class SortStackAsceding
{
    public static void main(String... args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.addElement(1);
        stack.addElement(10);
        stack.addElement(16);
        stack.addElement(5);
        stack.addElement(3);
        stack.addElement(2);
        Stack<Integer> sorted = sort(stack);
        while (!sorted.isEmpty())
        {
            System.out.print(sorted.pop() + ", ");
        }
    }

    private static Stack<Integer> sort(Stack<Integer> stack)
    {
        Stack<Integer> sorted = new Stack<Integer>();
        while (!stack.isEmpty())
        {
            Integer element = stack.pop();
            while (!sorted.isEmpty() && element<sorted.peek())
            {
                stack.push(sorted.pop());
            }
            sorted.push(element);
        }
        return sorted;
    }
}
