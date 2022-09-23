// Swap two numbers without using temporary variable

package com.bridgelabz.basiccore;
import java.util.Scanner;
public class SwapTwoNumbersWithoutTemp
{
    static void swapTwoNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Number2 : ");
        int number2 = scanner.nextInt();
        System.out.println("-----Before Swap------");
        System.out.println("First Number : "+number1);
        System.out.println("Second Number : "+number2);
        number1 = number1+number2; // consider First Number is temporary
        number2 = number1-number2; // consider Second number temporary
        number1 = number1-number2; // Number 1 & 2 Swap
        System.out.println("-----After Swap-----");
        System.out.println("First Number : "+number1);
        System.out.println("Second Number : "+number2);
    }
    public static void main(String[] args)
    {
        swapTwoNumbers();
    }
}
