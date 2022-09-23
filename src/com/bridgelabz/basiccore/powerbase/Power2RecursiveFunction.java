// Power of two by using Recursive Function

package com.bridgelabz.basiccore.powerbase;
public class Power2RecursiveFunction
{
    public static void main (String[]args)
    {
        int base = 2, p=4;
        System.out.println ("Required Power is " + power (base, p));
    }
    //Recursive Function
    static int power (int base, int x)
    {
        if (x == 0)     //Base Condition
            return 1;
        return (base * power (base, x - 1));
    }
}