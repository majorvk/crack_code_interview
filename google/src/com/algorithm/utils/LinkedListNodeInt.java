package com.algorithm.utils;

/**
 * Created by Viktar on 7/3/2014.
 */
public class LinkedListNodeInt {
    private Integer data;
    private LinkedListNodeInt prev;
    private LinkedListNodeInt next;

    public LinkedListNodeInt(Integer data, LinkedListNodeInt prev, LinkedListNodeInt next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public LinkedListNodeInt next()
    {
        return next;
    }
    public boolean hasNext()
    {
        return next != null;
    }
    public LinkedListNodeInt previous()
    {
        return prev;
    }

    public void setPrevious(LinkedListNodeInt node)
    {
        prev = node;
    }
    public void setNext(LinkedListNodeInt node)
    {
        next = node;
    }

    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }

    public String printData()
    {
        StringBuilder temp= new StringBuilder();
        LinkedListNodeInt n = this;
        while (n !=null)
        {
            temp.append(n.data).append("->");
            n = n.next;
        }

        return temp.toString();
    }
}
