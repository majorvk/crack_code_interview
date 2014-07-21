package com.algorithm.chapter2;

import com.algorithm.utils.LinkedListNode;

/**
 * Created by Viktar on 7/20/2014.
 */
public class DeleteMiddleFromSingleLinkedList {
    public static void main(String... args)
    {
        LinkedListNode n1 = new LinkedListNode("a",null, null);
        LinkedListNode n2 = new LinkedListNode("b",null, null);
        LinkedListNode n3 = new LinkedListNode("c",null, null);
        LinkedListNode n4 = new LinkedListNode("d",null, null);
        LinkedListNode n5 = new LinkedListNode("e",null, null);
        n1.setNext(n2);
        n2.setPrevious(n1);
        n2.setNext(n3);
        n3.setPrevious(n2);
        n3.setNext(n4);
        n4.setPrevious(n3);
        n4.setNext(n5);
        n5.setPrevious(n4);
        System.out.println(n1.printData());
        System.out.println(removeMiddle(n5));
        System.out.println(n1.printData());
    }

    public static boolean removeMiddle(LinkedListNode nodeToDelete)
    {
        if (nodeToDelete == null || nodeToDelete.next()==null)
        {
            return false;
        }
        nodeToDelete.setData(nodeToDelete.next().getData());
        nodeToDelete.setNext(nodeToDelete.next().next());
        return true;
    }

}
