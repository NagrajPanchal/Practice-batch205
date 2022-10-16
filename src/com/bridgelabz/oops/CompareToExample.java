package com.bridgelabz.oops;

public class CompareToExample
{
    public static void compareValues(Integer var1,Integer var2)
    {
//        Integer i1 = Integer.valueOf(var1);
        int res = var1.compareTo(var2);
        if(res==-1)
            System.out.println("var1 is smaller then var2");
         else if (res==0)
            System.out.println("Both are equals");
        else
            System.out.println("Var1 is bigger then var2");
    }
    public static void main(String[] args)
    {
        compareValues(1,1);
    }
}
