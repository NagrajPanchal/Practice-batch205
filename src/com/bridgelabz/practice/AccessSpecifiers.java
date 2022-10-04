// Access Specifiers
// public,private,protected,default

package com.bridgelabz.practice;

public class AccessSpecifiers
{
    static private int privateVar;
    static private int getPrivateVar(int a)
    {
        a = 10;
        return a;
    }
    public static void getPublicVar()
    {
        int a = 10;
        System.out.println(a);
    }
    protected static void getProtectedVar()
    {
        int a = 10;
        System.out.println("Protected method : "+a);
    }
    public static void main(String[] args)
    {
        System.out.println(privateVar); //Private variable
        System.out.println(AccessSpecifiers.getPrivateVar(10)); // Private method
        getPublicVar();
    }
}
