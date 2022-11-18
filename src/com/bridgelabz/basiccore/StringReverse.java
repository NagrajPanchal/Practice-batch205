package com.bridgelabz.basiccore;

public class StringReverse
{
    public String reverseString(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverseString(str.substring(0,str.length()-1));
        }
        return str;
    }
    public static void main(String[] args)
    {
    StringReverse strRes = new StringReverse();
    String str1 = strRes.reverseString("Apple");
        System.out.println(str1);
    }
}
