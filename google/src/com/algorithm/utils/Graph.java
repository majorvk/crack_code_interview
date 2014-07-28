package com.algorithm.utils;

/**
 * Created by Viktar_Korshun on 7/23/2014.
 */
public class Graph
{
    private Node vertices[];
    public int count;
    public Graph() {
        vertices = new Node[6];
        count = 0;
    }

    public void addNode(Node x) {
        if (count < 30) {
            vertices[count] = x;
            count++;
        } else {
            System.out.print("Graph full");
        }
    }

    public Node[] getNodes() {
        return vertices;
    }
}
