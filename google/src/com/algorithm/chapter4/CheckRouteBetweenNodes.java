package com.algorithm.chapter4;

import com.algorithm.utils.Graph;
import com.algorithm.utils.LinkedListNode;
import com.algorithm.utils.Node;

import java.util.LinkedList;

/**
 * Created by Viktar_Korshun on 7/23/2014.
 */
public class CheckRouteBetweenNodes
{
    public static void main(String a[])
    {
        Graph g = createNewGraph();
        Node[] n = g.getNodes();
        Node start = n[3];
        Node end = n[5];
        System.out.println(searchRoute(start, end));
    }

    public static Graph createNewGraph()
    {
        Graph g = new Graph();
        Node[] temp = new Node[6];

        temp[0] = new Node("a", 3);
        temp[1] = new Node("b", 0);
        temp[2] = new Node("c", 0);
        temp[3] = new Node("d", 1);
        temp[4] = new Node("e", 1);
        temp[5] = new Node("f", 0);

        temp[0].addAdjacent(temp[1]);
        temp[0].addAdjacent(temp[2]);
        temp[0].addAdjacent(temp[3]);
        temp[3].addAdjacent(temp[4]);
        temp[4].addAdjacent(temp[5]);
        for (int i = 0; i < 6; i++) {
            g.addNode(temp[i]);
        }
        return g;
    }

    public static boolean searchRoute(Node start, Node end)
    {
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(start);
        while (!queue.isEmpty())
        {
            Node node = queue.removeFirst();
            Node[] adjacent = node.getAdjacent();
            for (int i=0;i<adjacent.length;i++)
            {
                if(adjacent[i] == end)
                {
                    return true;
                }
                else {
                    queue.add(adjacent[i]);
                }
            }
        }
        return false;
    }
}
