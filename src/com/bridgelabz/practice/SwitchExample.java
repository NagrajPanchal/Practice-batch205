package com.bridgelabz.practice;
import java.util.Scanner;
public class SwitchExample
{
    static void method(int x)
    {
        switch (x)
        {
            case 'A':
                System.out.println("1st Case");
                break;
            case 'B':
                System.out.println("2nd Case");
                break;
            case 'C':
                System.out.println("3rd Case");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
    public static void main(String[] args)
    {
        System.out.print("Enter A-Z Charter : ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        method(ch);
    }
}
