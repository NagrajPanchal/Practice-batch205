// if Condition
package com.bridgelabz.practice;

public class IfCondition
{
    static void m1(int v)
    {
        if(v==30)
        {
            System.out.println("V is 30");
        }
        else {
            System.out.println("V is Not 30");
        }
    }
    public static void main(String[] args)
    {
        int x =10;
        int var = 30;
        m1(x); //call by Reference
        m1(30); // pass by value
    }
}
