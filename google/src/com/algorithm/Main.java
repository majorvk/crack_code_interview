package com.algorithm;

import com.algorithm.utils.LinkedListNode;

public class Main {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String word = scanner.nextLine();
        char[] str = word.toCharArray();*/

        //LinkedList<String> list = new LinkedList<String>();
        //list.addAll(Arrays.asList("aa","bb","cc","bb","cc"));
        //System.out.println("Without duplicates: " + Chapter2.removeDuplicate(list));

        LinkedListNode f1 = new LinkedListNode("a", null,null);
        LinkedListNode f2 = new LinkedListNode("b", null,null);
        LinkedListNode f3 = new LinkedListNode("c", null,null);
        LinkedListNode f4 = new LinkedListNode("a", null,null);
        LinkedListNode f5 = new LinkedListNode("c", null,null);
        f1.setNext(f2); f2.setNext(f3);f3.setNext(f4);f4.setNext(f5);
        Chapter2.removeDuplicate(f1);
        System.out.println("Without duplicates: " + f1.printData());
        //s1_1_unique_chars(word);
        //s_1_3_delete_duplicate(str);
        //ReplaceFun(str,3);
    }

    public static void ReplaceFun(char[] str, int length) {
            int spaceCount = 0, newLength, i = 0;
            for (i = 0; i < length; i++) {
                if (str[i] == ' ') {
                     spaceCount++;
                    }
                }
            newLength = length + spaceCount * 2;
            str[newLength] = '\0';
           for (i = length - 1; i >= 0; i--) {
               if (str[i] == ' ') {
                    str[newLength - 1] = '0';
                    str[newLength - 2] ='2';
                    str[newLength - 3] = '%';
                    newLength = newLength - 3;
                   } else {
                    str[newLength - 1] = str[i];
                    newLength = newLength - 1;
                   }
               }
         }
    private static void s_1_3_delete_duplicate(char[] str) {
        int len = str.length;
        /*if (str == null) return;
        if (len < 2) return;*/

        int pointer = 1;

        for (int i = 1; i < len; ++i)
        {
            boolean duplicate=false;
            for (int j=0; j< pointer; ++j)
            {
                //duplicate str[i]
                if (str[j] == str[i])
                {
                    duplicate=true;
                }
            }
            if (!duplicate)
            {
                str[pointer++]=str[i];
            }
        }
        str[pointer]=0;
        System.out.println("No duplicates " + new String(str));
    }

    private static void s1_1_unique_chars(String word) {
        int length = word.length();
        for (int i=0; i<=length - 1; i++)
        {
            for (int j=i+1; j <= length-1; j++)
            {
                if (word.charAt(i) == word.charAt(j))
                {
                    System.out.println("Not unique " + word.charAt(i));
                    return;
                }
            }
        }
        System.out.println("All unique ");
    }
}
