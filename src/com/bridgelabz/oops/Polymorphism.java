package com.bridgelabz.oops;

//Polymorphism => Many forms
// Types of Polymorphism => Compile-Time and Run-Time
// Compile-Time Polymorphism => Overloading
// Run-Time Polymorphism => Overriding
public class Polymorphism
{
    //Method signature => Method name with arguments
    //ex: m1(int x, int y)
    //Overloading
    // 2 or Method having same name but different number of arguments
    // Whenever we overload method resolution is taken care by the compiler based on run-time object
    // Return type does not play a role in overriding
    void m1()
    {
        System.out.println("--> m1()");
    }
    void m1(int x)
    {
        System.out.println("--> m1(int)"+x);
    }
    void m1(int x, int y)
    {
        System.out.println("--> m1(int x, int y)"+x+" "+y);
    }
    void m1(float x)
    {
        System.out.println("--> m1(float x)"+x);
    }
    void m1(float x, int y)
    {
        System.out.println("--> m1(float x,int y)"+x+" "+y);
    }

    void m1(double x , int y)
    {
        System.out.println(" -> m1(double,int) " + x + "..." + y);
    }
    public static void main(String[] args)
    {
        Polymorphism obj =new Polymorphism();
        obj.m1();
        obj.m1(12);
        obj.m1(12.3f);
        obj.m1(11.5f,17);
        obj.m1(4.5,2);
    }
}
