package com.algorithm.utils;

/**
 * Created by Viktar on 7/3/2014.
 */
public class LinkedListNode {
    private String data;
    private LinkedListNode prev;
    private LinkedListNode next;

    public LinkedListNode(String data, LinkedListNode prev, LinkedListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public LinkedListNode next()
    {
        return next;
    }
    public boolean hasNext()
    {
        return next != null;
    }
    public LinkedListNode previous()
    {
        return prev;
    }

    public void setPrevious(LinkedListNode node)
    {
        prev = node;
    }
    public void setNext(LinkedListNode node)
    {
        next = node;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String printData()
    {
        StringBuilder temp= new StringBuilder();
        LinkedListNode n = this;
        while (n !=null)
        {
            temp.append(n.data).append("->");
            n = n.next;
        }

        return temp.toString();
    }
}
