package com.algorithm;

import com.algorithm.utils.LinkedListNode;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Viktar on 7/3/2014.
 */
public class Chapter2 {

    public static LinkedList<String> removeDuplicate(LinkedList<String> list)
    {
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext())
        {
            String value = iterator.next();
            Iterator<String> descIterator = list.descendingIterator();
            while(descIterator.hasNext())
            {
                String desc = descIterator.next();
                if (desc.equals(value) && (list.lastIndexOf(desc) != list.indexOf(value)))
                {
                    iterator.remove();
                    break;
                }
            }
        }
        return list;
    }

    public static LinkedListNode removeDuplicate(LinkedListNode linkedList)
    {
        LinkedListNode head = linkedList.next();
        LinkedListNode index = head.next();
        while (head != null)
        {
            index = head.next();
            while (index != null && index.hasNext())
            {
                LinkedListNode next = index.next();
                if (next.getData() == head.getData())
                {
                    LinkedListNode temp = next.next();
                    index.setNext(temp);
                }
                else
                {
                    index = next;
                }
            }
            head = head.next();
        }
        return linkedList;
    }
}
