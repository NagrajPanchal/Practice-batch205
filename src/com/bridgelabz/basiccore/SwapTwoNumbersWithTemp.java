// Swap two numbers with using temporary variable

package com.bridgelabz.basiccore;
import java.util.Scanner;
public class SwapTwoNumbersWithTemp
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
        int temp = number1; // First Number assigned temporary
        number1 = number2; // Second Number is assigned to First Number
        number2 = temp; // Temporary is assigned to Second number
        System.out.println("-----After Swap-----");
        System.out.println("First Number : "+number1);
        System.out.println("Second Number : "+number2);
    }
    public static void main(String[] args)
    {
        swapTwoNumbers();
    }
}
