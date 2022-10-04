// Second Largest Array Element

package com.bridgelabz.arrayhandling;

public class SecondLargestNumber
{
    public static int secondLargest(int[] arr)
    {
        int firstNumber = 0;
        int secondNumber = 0;
        for (int i=0; i< arr.length;i++)
        {
            if(arr[i]> firstNumber)
            {
               secondNumber = firstNumber;
               firstNumber = arr[i];
            }
            else if (arr[i] > secondNumber && arr[i] != firstNumber)
            {
                secondNumber = arr[i];
            }
        }
        return secondNumber;
    }
    public static void main(String[] args)
    {
        int[] arr = {10,20,23,34,45,9,72,34,56,20};
         int secondNumber = secondLargest(arr);
         if(secondNumber == 0)
         {
             System.out.println("No Second Largest Number");
         }
         else
         {
             System.out.println(secondNumber+ " is second Largest Number");
         }

    }
}
