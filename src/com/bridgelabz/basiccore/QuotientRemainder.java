// Quotient and Remainder

package com.bridgelabz.basiccore;

import java.util.Scanner;

public class QuotientRemainder
{
    public static void main(String[] args)
    {
        int dividend,divisor;
        System.out.println("Enter 'Dividend' : ");
        Scanner in = new Scanner(System.in);
        dividend = in.nextInt();
        System.out.println("Enter 'Divisor' : ");
        divisor = in.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}
