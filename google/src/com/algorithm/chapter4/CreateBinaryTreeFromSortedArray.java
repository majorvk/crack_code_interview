package com.algorithm.chapter4;

import com.algorithm.utils.TreeNode;

/**
 * Created by Viktar_Korshun on 7/23/2014.
 */
public class CreateBinaryTreeFromSortedArray
{
    public static void main(String... args)
    {
        int[] array = {0,1,2,3,4,5,6,7,8,9,10};
        TreeNode result = buildTree(array);
        System.out.print(result);
    }

    private static TreeNode buildTree(int[] array)
    {
        return build(array,0,array.length-1);
    }
    private static TreeNode build(int[] array, int from, int to)
    {
        if (to<from)
        {
            return null;
        }
        int middle = (from+to)/2;
        TreeNode node = new TreeNode(""+array[middle]);
        node.setLeft(build(array,from, middle-1));
        node.setRight(build(array,middle+1,to));
        return node;
    }
}
