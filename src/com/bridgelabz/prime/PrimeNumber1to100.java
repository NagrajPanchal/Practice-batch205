// Print 1 to 100 Prime Numbers, greater then 10 print and store in array and then Print

package com.bridgelabz.prime;
public class PrimeNumber1to100
{
    public static void main(String[] args)
    {
        int number = 100,j;
        int size = 99;
        int[] arr = new int[size];
        System.out.print("\nPrime Numbers : ");
        for (int i =1; i< number; i++)
        {
            for(j=2; j<i; j++)
            {
                if(i % j == 0)
                    break;
            }
            if(i==j)
            {
                if(i >= 10)
                {
                    arr[i] = j;
                    System.out.print(j + " ");
                }
            }
        }
        System.out.print("\n\nStoring Array Elements : ");
        for (int i =1; i< size; i++)
        {
            if(arr[i] == 0)
                System.out.print("");
            else
                System.out.print(arr[i]+ " ");
        }
    }
}
