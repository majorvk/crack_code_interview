package com.algorithm.chapter4;

import com.algorithm.utils.TreeNode;

/**
 * Created by Viktar_Korshun on 7/22/2014.
 */
public class TreeIsBalanced
{
    public static void main(String... args)
    {
        TreeNode node1 = new TreeNode("1");
        TreeNode node2 = new TreeNode("2");
        TreeNode node3 = new TreeNode("3");
        TreeNode node4 = new TreeNode("4");
        TreeNode node5 = new TreeNode("5");
        TreeNode node6 = new TreeNode("6");
        TreeNode node7 = new TreeNode("7");
        node1.setLeft(node2);
        node1.setRight(node3);

        node2.setLeft(node4);
        node2.setRight(node5);

        node3.setRight(node6);
        node3.setLeft(node7);
        boolean balanced = isBalanced(node1);
        System.out.print(balanced);
    }

    private static boolean isBalanced(TreeNode node1)
    {
        return maxDepth(node1) - minDepth(node1)<=1;
    }

    private static int maxDepth(TreeNode node1)
    {
        if (node1 == null)
        {
            return 0;
        }
        return 1 + Math.max(maxDepth(node1.getLeft()), maxDepth(node1.getRight()));
    }

    private static int minDepth(TreeNode node1)
    {
        if (node1 == null)
        {
            return 0;
        }
        return 1 + Math.min(minDepth(node1.getLeft()), minDepth(node1.getRight()));
    }
}
