package com.bridgelabz.basiccore;
import java.util.Scanner;
public class EvenOddNumber
{
    static int evenOddNumber()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        if(number%2==0)
        {
            System.out.println(number+ " is Even Number");
        }
        else
        {
            System.out.println(number+ "is Odd Number");
        }
        return number;
    }
    public static void main(String[] args)
    {
    evenOddNumber();
    }
}
