// find Duplicate Array of elements

package com.bridgelabz.arrayhandling;
import java.util.Scanner;
public class DuplicateArrayOfElement
{
    public static int size;
    public static int[] arr;
    public static void userDefinedArrayOfSizeAndElements()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        size = scanner.nextInt();
        arr = new int[size];
        System.out.print("Enter Array of Elements : ");
        for (int i=0; i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
    }
    public static void arrayOfElements()
    {
        System.out.print("Array of Elements : ");
        for (int b : arr)
            System.out.print(b+" ");
    }
    public static void duplicateElements()
    {
        System.out.print("\nDuplicate array of Elements : ");
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        userDefinedArrayOfSizeAndElements();
        arrayOfElements();
        duplicateElements();

    }
}
