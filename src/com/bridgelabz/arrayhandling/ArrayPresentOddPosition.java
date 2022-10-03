/* Java Program to print the elements of an array present on an Odd position */

package com.bridgelabz.arrayhandling;
import java.util.Scanner;
public class ArrayPresentOddPosition
{
    public static void main(String[] args)
    {
        System.out.print("Enter Size of Array : ");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the Array Elements : ");
        for (int i=0; i<size; i++ )
        {
            arr[i] = obj.nextInt();
        }
        System.out.print("Array Elements : ");
        for (int i=0; i<size; i++ )
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nArray Present on Odd Position : \n");
        for (int i=1; i<arr.length; i=i+2 ) // initialization odd position of Index
        {
            System.out.print("Index : "+i+","+"Value : "+arr[i]+" \n"); // index of Array Odd Position
        }

    }
}
