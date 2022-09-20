package com.bridgelabz.pattern;

public class DemoDiamond
{
    public static void main(String[] args)
    {   for (int i = 1; i <= 5; i++)
            {
                System.out.println();
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(" *");
                }
            }
        for (int i=1; i<=4; i++)
        {
            System.out.println();
            for (int j=4; j>=i; j--)
            {
                System.out.print(" *");
            }
        }
    }
}
