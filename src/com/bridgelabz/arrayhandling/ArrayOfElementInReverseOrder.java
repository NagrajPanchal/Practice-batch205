package com.bridgelabz.arrayhandling;

public class ArrayOfElementInReverseOrder
{
    public static int reverseElement;
    public static void reverseOrder()
    {
        int[] arr = {12,24,48,64,82,8,6,4,2};
        for (int i = arr.length-1; i>=0;i--)
        {
            if(arr[i] > reverseElement)
            {
                reverseElement = arr[i];
            }
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        reverseOrder();
    }
}
