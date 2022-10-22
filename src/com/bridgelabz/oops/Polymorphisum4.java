package com.bridgelabz.oops;

public class Polymorphisum4
{
    static void method1(int x,float y)
    {
        System.out.println("First");
        System.out.println(x);
        System.out.println(y);
    }
    static void method1(float x,int y)
    {
        System.out.println("Second");
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args)
    {
        method1(12,2.1F);
        method1(23.5F,12);
        //method1(2,6); // Ambiguity method call

    }
}
