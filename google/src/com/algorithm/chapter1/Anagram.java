package com.algorithm.chapter1;

public class Anagram {
    public static void main(String... args)
    {
        System.out.print(isAnagram2("abcd","cbda"));
        System.out.print(isAnagram2("abcd","cbdj"));
    }
    public static boolean isAnagram(String str1,String str2) {
        return str1 == str2;
    }
    public static boolean isAnagram2(String str1,String str2) {
        if(str1.length()!= str2.length())
            return false;
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[] buf = new int[256];
        for (int i=0;i<chars1.length;i++)
        {
            buf[chars1[i]]+=1;
        }
        for (int i=0;i<chars2.length;i++)
        {
            buf[chars2[i]]-=1;
        }
        for (int i=0;i<256;i++)
        {
            if(buf[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}