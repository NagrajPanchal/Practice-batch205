package com.bridgelabz.practice;

public class ArrayExample
{
    public static void main(String[] args)
    {
    int[] arr = new int[10];
        arr[0] = 10;
        arr[3] = 22;
        arr[8] = 12;
        arr[9] = 25;
        arr[5] = 40;
        for(int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
