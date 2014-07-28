package com.algorithm.chapter2;

import com.algorithm.utils.LinkedListNodeInt;

/**
 * Created by Viktar on 7/20/2014.
 */
public class SumDigitsLinkedList {
    public static void main(String... args)
    {
        LinkedListNodeInt n1 = new LinkedListNodeInt(6,null, null);
        LinkedListNodeInt n2 = new LinkedListNodeInt(7,null, null);
        LinkedListNodeInt n3 = new LinkedListNodeInt(8,null, null);
        LinkedListNodeInt n4 = new LinkedListNodeInt(9,null, null);
        LinkedListNodeInt n5 = new LinkedListNodeInt(5,null, null);
        n1.setNext(n2);
        n2.setPrevious(n1);
        n2.setNext(n3);
        n3.setPrevious(n2);

        n4.setNext(n5);
        n5.setPrevious(n4);
        System.out.println(n1.printData());
        System.out.println(n4.printData());
        LinkedListNodeInt result = calc(n1, n4, 0);
        System.out.println(result.printData());
    }

    public static LinkedListNodeInt calc(LinkedListNodeInt node1, LinkedListNodeInt node2, int carry)
    {
        if (node1 == null && node2==null)
        {
            return null;
        }
        LinkedListNodeInt head = new LinkedListNodeInt(null, null,null);
        int value = carry;
        if(node1 != null)
        {
            value += node1.getData();
        }
        if(node2 != null)
        {
            value += node2.getData();
        }
        head.setData(value%10);
        LinkedListNodeInt res = calc(node1 != null ? node1.next() : null, node2 != null ? node2.next() : null, value > 10 ? 1 : 0);
        head.setNext(res);
        return head;
    }

}
