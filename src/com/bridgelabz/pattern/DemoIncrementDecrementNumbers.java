// Pattern Shape Numbers Increments and Decrements
package com.bridgelabz.pattern;

public class DemoIncrementDecrementNumbers
{
    public static void main(String[] args)
    {
        for (int i =1; i<=5; i++)
        {
            System.out.println();
            for (int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
        }
        for (int i=5; i>=1; i--)
        {
            System.out.println();
            for (int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
        }
        /*
        for (int i=1; i<5; i++)
        {
            System.out.println();
            for (int j=5; j>=i; j--)
            {
                System.out.print(j);
            }
        }

         */
    }
}
