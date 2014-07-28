package com.algorithm.utils;

/**
 * Created by Viktar_Korshun on 7/22/2014.
 */
public class TreeNode
{
    private String data;
    private Integer intData;
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;

    public TreeNode(String data)
    {
        this.data = data;
    }
    public TreeNode(Integer data)
    {
        this.intData = data;
    }
    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public Integer getIntData()
    {
        return intData;
    }

    public void setIntData(Integer intData)
    {
        this.intData = intData;
    }

    public TreeNode getLeft()
    {
        return left;
    }

    public void setLeft(TreeNode left)
    {
        this.left = left;
        if (left!=null)
        {
            left.parent = this;
        }
    }

    public TreeNode getRight()
    {
        return right;
    }

    public void setRight(TreeNode right)
    {
        this.right = right;
        if (right!=null)
        {
            right.parent = this;
        }
    }

    public TreeNode getParent()
    {
        return parent;
    }

    public void setParent(TreeNode parent)
    {
        this.parent = parent;
    }
}
