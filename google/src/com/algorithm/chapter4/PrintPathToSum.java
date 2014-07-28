package com.algorithm.chapter4;

import com.algorithm.utils.TreeNode;

import java.util.ArrayList;

/**
 * Created by Viktar_Korshun on 7/23/2014.
 */
public class PrintPathToSum
{
    public static void main(String a[])
    {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);
        n4.setLeft(n8);
        n8.setRight(n9);
        findPath(n1, 8);
    }
    public static void findPath(TreeNode node1, int sum)
    {
        findPath(node1, sum, new ArrayList<Integer>());

    }

    public static void findPath(TreeNode node1, int sum, ArrayList<Integer> path)
    {
        if (node1 == null)
        {
            return;
        }
        path.add(node1.getIntData());
        int pathSum=0;
        for (int i=0;i<path.size();i++)
        {
            pathSum+=path.get(i);
        }
        if (sum == pathSum)
        {
            printPath(path);
        }
        findPath(node1.getLeft(),sum,path);
        findPath(node1.getRight(),sum,path);
    }

    public static void printPath(ArrayList<Integer> path)
    {
        for (int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i) + "->");
        }
    }
}
