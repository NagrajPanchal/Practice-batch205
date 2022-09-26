// prime factors of number N

package com.bridgelabz.basiccore;

import java.util.Scanner;

public class PrimeFactors
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        System.out.println("Prime Factors of "+number+ " number"); // Prime Numbers : 2,3,5,7,11,13,...
        for(int i = 2; i<number; i++) // Prime Number will Start 2 
        {
            while(number%i == 0)
            {
                System.out.print(i+ ",");
                number /= i;
            }
        }
        if (number>2)
        {
            System.out.print(number);
        }
    }
}
