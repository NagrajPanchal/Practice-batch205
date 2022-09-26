// Increment Numbers 1 to 5 step by step

package com.bridgelabz.pattern;

public class DemoIncrementNumbers
{
    public static void main(String[] args)
    {
        for (int i =1; i<=5; i++) //i=1,2,3,4,5
        {
            for (int j=1; j<=i; j++) //i=2 j==2
            {
                System.out.print(j); //j=1
            }
            System.out.println();
        }
    }
}
