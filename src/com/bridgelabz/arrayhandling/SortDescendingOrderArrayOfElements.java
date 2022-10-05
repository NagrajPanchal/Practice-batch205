// Array of the element in Descending Orders

package com.bridgelabz.arrayhandling;
public class SortDescendingOrderArrayOfElements
{
    public static void sortDescendingOrder()
    {
        int[] arr =new int[7];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 12;
        arr[3] = 06;
        arr[4] = 51;
        arr[5] = 35;
        arr[6] = 23;
        System.out.println("Array of elements : ");
        for (int b: arr)
        {
            System.out.print(" " +b);
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i +1; j< arr.length; j++)
            {
                if (arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nSorted in descending order : " );
        for (int b:arr) // for each loop
        {
            System.out.print(b+" ");
        }
    }
    public static void main(String[] args)
    {
    sortDescendingOrder();
    }
}
