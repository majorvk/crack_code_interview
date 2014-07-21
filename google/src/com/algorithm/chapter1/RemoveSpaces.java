package com.algorithm.chapter1;

public class RemoveSpaces {
    public static void main(String... args)
    {
        String str = " abcd fdfd dfs ";
        System.out.print(process(str));
    }
    public static String process(String str) {
        int spacesCount=0;
        char[] chars = str.toCharArray();
        for (int i=0;i<str.length();i++)
        {
            if (chars[i]== ' ')
            {
                spacesCount++;
            }
        }
        int newSize = str.length()+spacesCount*2;
        int pointer = newSize;
        char[] result = new char[newSize];
        for (int i=chars.length-1;i>=0;i--)
        {
            if (chars[i]== ' ')
            {
                result[pointer-1]='0';
                result[pointer-2]='2';
                result[pointer-3]='%';
                pointer-=3;
            }
            else
            {
                result[pointer-1]=chars[i];
                pointer-=1;
            }
        }
        return new String(result);
    }
}