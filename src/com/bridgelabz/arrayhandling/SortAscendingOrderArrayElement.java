// Sort Ascending Order Array of Element

package com.bridgelabz.arrayhandling;

public class SortAscendingOrderArrayElement
{
    public static void sortAscendingOrder()
    {
        int[] arr = {12,13,23,6,34,48,16,35};
        System.out.print("Array of Elements : ");
        for (int b:arr) // for each loop
        {
            System.out.print(b+",");
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i +1; j< arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                }
            }
        }
        System.out.print("\nSorted in ascending order : " );
        for (int i = 0; i< arr.length; i++) // for loop
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args)
    {
    sortAscendingOrder();
    }
}
