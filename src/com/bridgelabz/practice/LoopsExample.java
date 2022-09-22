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
int x =2;
        System.out.println(x);
       //int y = ++x;
        //System.out.println(y);
int sum = x++ + ++x + x++ + x++ + ++x;
        System.out.println(sum);
        System.out.println(x);
    }
}
