// Multiplication of 2 up to nth term by using Simple logic

package com.bridgelabz.basiccore.powerbase;
import java.util.Scanner;
public class Power2SimpleLogic
{
    public static void main(String[] args) {
        int n, result = 1;
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (0 < n && 2 < 31)
        {
            for (int i = 1; i <= n; i++)
            {
                result = 2 * i;
                System.out.println("Result : " + "2*" + i + "=" + result);
            }
           } else {
            System.out.println("Invalid number");
        }

    }

}