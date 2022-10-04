// Largest Element in an Array

package com.bridgelabz.arrayhandling;

public class LargestElementOfArray
{
    static boolean largestNumber;
    public static void largest()
    {
        int[] arr = {12,13,10,25,40,51};
        int max = arr[0];
        for(int i=0; i< arr.length;i++)
        {
                if (arr[i] > max)
                {
                   max = arr[i];
                }
        }
        System.out.println(max+" is Largest Array of Element");
    }
    public static void main(String[] args)
    {
        largest();
    }
}
