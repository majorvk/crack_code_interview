package com.algorithm.chapter4;

import com.algorithm.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Viktar_Korshun on 7/23/2014.
 */
public class CreateLevelsListOfBST
{
    public static void main(String... args)
    {
        int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        TreeNode result = buildTree(array);
        List<LinkedList<TreeNode>> levels = getLevels(result);
        System.out.print(levels.size());
    }

    public static List<LinkedList<TreeNode>> getLevels(TreeNode node)
    {
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        int levelNumber = 0;
        list.add(node);
        result.add(levelNumber, list);
        while (true)
        {
            LinkedList<TreeNode> level = new LinkedList<TreeNode>();
            for(int i=0;i<result.get(levelNumber).size(); i++)
            {
                TreeNode treeNode = result.get(levelNumber).get(i);
                if (treeNode != null)
                {
                    if (treeNode.getLeft() != null)
                    {
                        level.add(treeNode.getLeft());
                    }
                    if (treeNode.getRight() != null)
                    {
                        level.add(treeNode.getRight());
                    }
                }
            }
            levelNumber++;
            if(level.isEmpty())
            {
                break;
            }
            else {
                result.add(levelNumber, level);
            }
        }
        return result;

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
