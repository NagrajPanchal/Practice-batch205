//Greatest Number or Largest Number
package com.bridgelabz.basiccore;
import java.util.Scanner;
public class GreatestNumber
{
    static void greatestNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Number 2 : ");
        int number2 = scanner.nextInt();
        System.out.print("Enter Number 3 : ");
        int number3 = scanner.nextInt();
        if ((number1 > number2) && (number1 > number3))
        {
            System.out.println(number1+ " is Greatest");
        }
        else if ((number2 > number1) && (number2 > number3))
        {
            System.out.println(number2+ " is Greatest");
        }
        else
        {
            System.out.println(number3+ " is Greatest");
        }

    }
    public static void main(String[] args)
    {
greatestNumber();
    }
}
