// Array Elements

package com.bridgelabz.arrayhandling;
public class ArrayElement
{
    public static void main(String[] args)
    {
        System.out.println("Array Array Elements are : ");
        int[] arr = new int[8];
        arr[0] = 10;
        arr[2] = 20;
        arr[4] = 22;
        arr[6] = 34;
        for(int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
