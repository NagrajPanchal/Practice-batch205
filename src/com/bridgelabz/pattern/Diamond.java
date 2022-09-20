package com.bridgelabz.pattern;

public class Diamond
{
    public static void main(String[] args)
    {
        for (int i=0; i<5; i++)
        {
            for (int j=5; j>i+1; j--)
                System.out.print(" ");
            for (int j=0; j<=i*2; j++ )
                System.out.print("*");
            System.out.println();
        }
        for(int i=5;i>0;i--)
        {
            for(int k=5;k>i;k--)
                System.out.print(" ");
            for(int j=0;j<i*2-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
