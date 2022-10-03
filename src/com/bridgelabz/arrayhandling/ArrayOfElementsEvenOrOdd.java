/* Java Program to print the elements of an array even/Odd value */

package com.bridgelabz.arrayhandling;
import java.util.Scanner;
public class ArrayOfElementsEvenOrOdd
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
        System.out.print("\nArray of Elements Even Values : ");
        for (int i=0; i<size; i++ )
        {
            if ( arr[i] %2 == 0 ) // Array of elements even values
            {
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.print("\nArray of Elements Odd Values : ");
        for (int i=0; i<size; i++ )
        {
            if ( arr[i] %2 != 0 ) // Array of elements Odd values
            {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}