package com.bridgelabz.arrayhandling;

import java.util.Scanner;

public class ArrayElement
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = scanner.nextInt();
        System.out.print("Enter Array Size : ");
        int[] arr = new int[size];
        arr[0] = 10;
        arr[2] = 20;
        arr[4] = 22;
        arr[6] = 34;
        for(int i=0; i< size; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
