// Frequency of each array elements
package com.bridgelabz.arrayhandling;

import java.util.Scanner;

public class FrequencyOfEachElementInArray
{
    public static int[] arr;
    public static int f[];
    public static void userDefineElement()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = scanner.nextInt();
        System.out.print("Enter Array of Elements : ");
        arr = new int[size];
        f = new int[size];
        for(int i = 0 ; i< arr.length; i++)
        {
            arr[i] = scanner.nextInt();
            f[i] = -1;
        }
    }
    public static void arrayOfElements()
    {
        for(int i = 0; i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    void frequencyOfElements()
    {
        for(int i = 0; i< arr.length;i++)
        {
            System.out.print(f[i]+" ");
        }
    }
    public static void frequencyOfEachElement()
    {
        for(int i=0; i< arr.length; i++)
        {
            int count = 1;
            for(int j=i+1; j< arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    f[j] = 0;
                }
            }
            if(f[i]!= 0)
                f[i]=count;
        }
        System.out.println("\nFrequency of each elements : ");
        for(int i=0; i< arr.length;i++)
        {
            if(f[i]!=0)
                System.out.println(arr[i]+" Comes "+f[i]+" times");
        }
    }
    public static void main(String[] args)
    {
        userDefineElement();
        System.out.print("Array of Elements : ");
        arrayOfElements();
        System.out.print("\nInitially frequency of Elements : ");
        FrequencyOfEachElementInArray frequency = new FrequencyOfEachElementInArray();
        frequency.frequencyOfElements();
        frequencyOfEachElement();
    }
}
