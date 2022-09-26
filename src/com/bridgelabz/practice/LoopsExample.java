// Loops
package com.bridgelabz.practice;
import java.util.Scanner;
public class LoopsExample
{
    // Loops ==> Used for Iteration
    // repeat the code based on some condition
    // X++ Post increment
    // ++X Pre increment
    // X-- Post decrement
    // --X Pre decrement
    // it will increment
    public static void main(String[] args)
    {
        /*
int x =2;
        System.out.println(x);
       //int y = ++x;
        //System.out.println(y);
int sum = x++ + ++x + x++ + x++ + ++x;
        System.out.println(sum);
        System.out.println(x);
        int y =10;
        int result = y--+ --y + y++ + y++ + y--;
        //      45 = 10 +   8 + 8   + 9   + 10
        System.out.println(result);
        System.out.println(y); //9
        */
         // for loop
        System.out.println("For Loop Starts");

        for (int i = 0; i < 10; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("\nFor Loop Ends");

        System.out.println("For Loop Starts");

        for (int i = 5; i >= 0; --i)
        {
            System.out.print(i+" ");
        }
        System.out.println("\nFor Loop Ends");

        System.out.println("While Loop Starts");
        int b = 0;
        while (b<10)
        {
            System.out.print(b+" ");
            b++;
        }

        System.out.println("While Loop Ends");
        System.out.println("While Loop Starts");
        int a = 10;
        while (a>=0)
        {
            System.out.print(a+" ");
            a--;
        }

        System.out.println("While Loop Ends");

        System.out.println("Do While Loop Starts");
        int c = 0;
        do{
             if(c == 8)
                 break;
            System.out.print(c+" ");
            c++;
        }while (c<10);

        System.out.println("\nDo While Loop Ends");
    }
}
