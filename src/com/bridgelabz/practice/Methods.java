// Methods
package com.bridgelabz.practice;

public class Methods
{
    static void method1(int x)
    {
        if(x%2 == 0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    static int sum(int x,int y)
    {
        int sum = x+y;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Hello");
        method1(5);
        sum(2,5);
    }
}
