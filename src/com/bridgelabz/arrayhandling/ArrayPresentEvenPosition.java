// Array Present on even Position

package com.bridgelabz.arrayhandling;

import java.util.Scanner;

public class ArrayPresentEvenPosition
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = scanner.nextInt();
        System.out.print("Enter Array Elements : ");
        int[] arr =new int[size];
        for(int i= 0; i <size; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array of Elements : ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nArray Present on Even Position");
        for(int i=2; i<size; i=i+2)
        {
            System.out.println("Index"+i+"Value"+arr[i]);
        }
    }
}
