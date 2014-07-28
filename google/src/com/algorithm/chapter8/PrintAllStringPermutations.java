package com.algorithm.chapter8;

import java.util.ArrayList;

/**
 * Created by Viktar_Korshun on 7/24/2014.
 */
public class PrintAllStringPermutations
{
    public static void main(String[] args) {
        //permutation("", "abc");

        ArrayList<String> items = permute("abc");
        for (String item: items)
        {
            System.out.println(item);
        }
    }

    private static void permutation(String prefix, String str){
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        }
        else {
            for (int i = 0; i < n; i++)
            {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
            }
        }
    }

    private static ArrayList<String> permute(String str){
        ArrayList<String> result = new ArrayList<String>();
        int n = str.length();
        if (n == 0) {
            result.add("");
            return result;
        }
        char first = str.charAt(0);
        String left = str.substring(1);
        ArrayList<String> lists = permute(left);
        for (String item:lists)
        {
            for (int i=0;i<=item.length();i++)
            {
                result.add(insertChar(item,i,first));
            }
        }
        return result;
    }
    private static String insertChar(String str,int pos, char symbol)
    {
        String start = str.substring(0, pos);
        String end = str.substring(pos);
        System.out.println(start+" "+symbol+" "+end);
        return start+symbol+end;
    }


}
