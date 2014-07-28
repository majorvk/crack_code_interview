package com.algorithm.chapter2;

import com.algorithm.utils.LinkedListNode;

/**
 * Created by Viktar on 7/20/2014.
 */
public class ReturnCircularElementInLinkedList
{
    public static void main(String... args)
    {
        LinkedListNode n1 = new LinkedListNode("a",null, null);
        LinkedListNode n2 = new LinkedListNode("b",null, null);
        LinkedListNode n3 = new LinkedListNode("c",null, null);
        LinkedListNode n4 = new LinkedListNode("d",null, null);
        LinkedListNode n5 = new LinkedListNode("e",null, null);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n2);
        //System.out.println(n1.printData());
        System.out.println(getCircular(n1).getData());
    }

    public static LinkedListNode getCircular(LinkedListNode node)
    {
        if (node == null)
        {
            return null;
        }
        LinkedListNode head = node;
        LinkedListNode runner = node;
        while (runner != null)
        {
            if(runner == null|| runner.next() == null)
            {
                return null;
            }
            node = node.next();
            runner = runner.next().next();
            if(node == runner)
            {
                break;
            }
        }
        while (runner != head)
        {
            runner = runner.next();
            head = head.next();
        }
        return runner;
    }
}
