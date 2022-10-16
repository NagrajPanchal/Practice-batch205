package com.bridgelabz.doubtsession;

public class Array2D
{
    public static void main(String[] args)
    {
        int arr2[][] = {{1,2},{2,4}};
        for(int i=0; i< arr2.length;i++)
        {
            for(int j=0; j< arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
