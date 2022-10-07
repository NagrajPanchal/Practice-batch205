// find Duplicate Array of elements

package com.bridgelabz.arrayhandling;
import java.util.Scanner;
public class DuplicateArrayOfElement
{
    public static void userDefinedArrayOfSizeAndElements()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array of Elements : ");
        for (int i=0; i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Array of Elements : ");
        for (int b : arr)
            System.out.print(b+" ");
    }
    public static void duplicateElements()
    {
        userDefinedArrayOfSizeAndElements();
        System.out.println("Duplicate array of Elements : ");
        int arr;
//        for(int i = 0; i<arr.length; i++)
//        {
//            for(int j = i+1; j<arr.length; j++)
//            {
//                System.out.print(arr[j]);
//            }
//        }
    }
    public static void main(String[] args)
    {
        duplicateElements();

    }
}
