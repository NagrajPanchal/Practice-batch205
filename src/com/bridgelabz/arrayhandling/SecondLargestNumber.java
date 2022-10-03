// Second Largest Number

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
        SecondLargestNumber second = new SecondLargestNumber();
         int secondNumber = 0;
         if(secondNumber != 0)
         {
             System.out.println("Not a Second Largest Number");
         }
         else
         {
             System.out.println(secondNumber+ "is second Largest Number");
         }

    }
}
