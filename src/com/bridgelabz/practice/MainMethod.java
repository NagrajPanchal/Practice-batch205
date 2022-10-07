package com.bridgelabz.practice;

public class MainMethod //class
{
    //1. Why main method is Public and static
    // JVM calls the main method
    // For the JVM to access the main method it is public
    // Main method is Static so that there is no requirement of object for calling

    //2. Why it has void return type ?
    // Every Program starts from main method and Ends at the main method Thats Why it is having void as return type

    //3. What is String[] args?
    // String[] args => Command Line Arguments

    public static void main(String[] args) // Main Method
    {
        System.out.println("main Method");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        int sum = x1+x2; // Adding two numbers
        System.out.println(sum);
        String var = args[0]+args[1]+args[2]; // Concatenation operation
        System.out.println(var);

    }
}
