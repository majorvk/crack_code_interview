package com.algorithm.chapter4;

import com.algorithm.utils.Graph;
import com.algorithm.utils.Node;
import com.algorithm.utils.TreeNode;

import java.util.LinkedList;

/**
 * Created by Viktar_Korshun on 7/23/2014.
 */
public class CheckTreeIsSubtree
{
    public static void main(String a[])
    {
        TreeNode n1 = new TreeNode("1");
        TreeNode n2 = new TreeNode("2");
        TreeNode n3 = new TreeNode("3");
        TreeNode n4 = new TreeNode("4");
        TreeNode n5 = new TreeNode("5");
        TreeNode n6 = new TreeNode("6");
        TreeNode n7 = new TreeNode("7");
        TreeNode n8 = new TreeNode("8");
        TreeNode n9 = new TreeNode("9");

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);
        n4.setLeft(n8);
        n8.setRight(n9);
        System.out.println(isSubtree(n1, n4));
    }

    public static boolean isSubtree(TreeNode node1, TreeNode node2)
    {
        return subTree(node1, node2);
    }

    public static boolean subTree(TreeNode node1, TreeNode node2)
    {
        if (node1.getData() == node2.getData())
        {
            return matches(node1, node2);
        }
        return subTree(node1.getLeft(), node2) || subTree(node1.getRight(), node2);
    }

    public static boolean matches(TreeNode node1, TreeNode node2)
    {
        if (node2 == null && node1 == null)
        {
            return true;
        }
        if (node2 == null || node1 == null)
        {
            return false;
        }
        if (node1.getData() == node2.getData())
        {
            return matches(node1.getLeft(), node2.getLeft()) && matches(node1.getRight(), node2.getRight());
        }
        return false;
    }
}
