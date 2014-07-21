package com.algorithm.chapter2;

import com.algorithm.utils.LinkedListNode;

import java.util.HashSet;

/**
 * Created by Viktar on 7/20/2014.
 */
public class RemoveDuplicatesFromLinkedList {
    public static void main(String... args)
    {
        LinkedListNode n1 = new LinkedListNode("aa",null, null);
        LinkedListNode n2 = new LinkedListNode("bb",null, null);
        LinkedListNode n3 = new LinkedListNode("aa",null, null);
        LinkedListNode n4 = new LinkedListNode("aaa",null, null);
        LinkedListNode n5 = new LinkedListNode("aa",null, null);
        n1.setNext(n2);
        n2.setPrevious(n1);
        n2.setNext(n3);
        n3.setPrevious(n2);
        n3.setNext(n4);
        n4.setPrevious(n3);
        n4.setNext(n5);
        n5.setPrevious(n4);
        System.out.println(n1.printData());
        removeDuplicates(n1);
        //removeDuplicatesWithBuffer(n1);
        System.out.println(n1.printData());
    }

    public static void removeDuplicatesWithBuffer(LinkedListNode node)
    {
        HashSet<String> set = new HashSet<String>();
        set.add(node.getData());
        node=node.next();
        while (node != null)
        {
            if (set.contains(node.getData()))
            {
                node.previous().setNext(node.next());
                if (node.next()!=null)
                {
                    node.next().setPrevious(node.previous());
                }
            }
            node= node.next();
        }
    }

    public static void removeDuplicates(LinkedListNode node)
    {
        LinkedListNode current = node;
        while (current != null)
        {
            LinkedListNode runner =current.next();
            while (runner!=null)
            {
                if (runner.getData()==current.getData())
                {
                    runner.previous().setNext(runner.next());
                    if (runner.next()!=null)
                    {
                        runner.next().setPrevious(runner.previous());
                    }

                }
                runner=runner.next();
            }
            current= current.next();
        }
    }
}
