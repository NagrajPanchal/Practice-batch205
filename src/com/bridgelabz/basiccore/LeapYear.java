// Leap Year
package com.bridgelabz.basiccore;
import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = scanner.nextInt();
        if((year%400==0) || (year%4==0 && year%100!=0))
        {
            System.out.println(year+ " is Leap year");
        }
        else
        {
            System.out.println(year+ " is Not a Leap year");
        }
    }
}
