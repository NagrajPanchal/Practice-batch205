package com.bridgelabz.functional;

import java.util.Scanner;

public class SumOf3IntegerAddsTo0
{
    void DistinctTriplets()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of value you want to check");
        int lenghtOfNumbers = scanner.nextInt();
        int[] numbers = new int[lenghtOfNumbers];
        for (int index = 0; index < numbers.length; index++)
        {
            System.out.println("Enter the " + (index + 1) + " number : ");
            numbers[index] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("The sums that adds to zero are :");
        for (int i = 0; i < numbers.length - 2; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                for (int k = j + 1; k < numbers.length; k++)
                {
                    int sum = numbers[i] + numbers[j] + numbers[k];
                    if (sum == 0)
                        System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                }
            }
        }
    }
public static void main(String[] args)
{
    SumOf3IntegerAddsTo0 tripletsObject = new SumOf3IntegerAddsTo0();
    tripletsObject.DistinctTriplets();
}
}
