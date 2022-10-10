package com.bridgelabz.oops;
// Inheritance ==> Inheriting the properties of parent class in to the Child class
// Through inheritance we are achieving code reusabilty.
// A clas is Parent class, B is the Child Class
class A
{
    int x = 10;
    void m1()
    {
        System.out.println("Class from A");
    }
}

class B extends A // Inherited some of the all properties from parent class
{
 public static int y = 30;
 public static void m2()
 {
     System.out.println("class from B");
 }
}
public class InheritanceBasics
{
    public static void main(String[] args)
    {
        B objb = new B();
        System.out.println(objb.x); // Inherited from Parent class A
        System.out.println(objb.y); // Child Class
        objb.m1(); // Not required for object creation inherited from parent class
        objb.m2(); // access through child class object
    }
}
