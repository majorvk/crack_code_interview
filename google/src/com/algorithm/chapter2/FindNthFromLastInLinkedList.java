package com.algorithm.chapter2;

import com.algorithm.utils.LinkedListNode;

/**
 * Created by Viktar on 7/20/2014.
 */
public class FindNthFromLastInLinkedList {
    public static void main(String... args)
    {
        LinkedListNode n1 = new LinkedListNode("a1",null, null);
        LinkedListNode n2 = new LinkedListNode("a2",null, null);
        LinkedListNode n3 = new LinkedListNode("a3",null, null);
        LinkedListNode n4 = new LinkedListNode("a4",null, null);
        LinkedListNode n5 = new LinkedListNode("a5",null, null);
        n1.setNext(n2);
        n2.setPrevious(n1);
        n2.setNext(n3);
        n3.setPrevious(n2);
        n3.setNext(n4);
        n4.setPrevious(n3);
        n4.setNext(n5);
        n5.setPrevious(n4);
        System.out.println(n1.printData());
        System.out.println(findNthFromLast(n1, 3));
    }

    public static String findNthFromLast(LinkedListNode node, int n)
    {
        if (node == null || n<1)
        {
            return null;
        }
        int i =0;
        LinkedListNode runner = node;
        while (i<n)
        {
            if(runner == null)
            {
                return null;
            }
            i++;
            runner = runner.next();
        }
        while (runner!= null)
        {
            runner = runner.next();
            node = node.next();
        }
        return node.getData();
    }
}
