package com.bridgelabz.oops;

class Parent3
{
    int p1;
    Parent3()
    {
        System.out.println("Parent3()");
    }
    Parent3(int p1)
    {
        this.p1 = p1;
        System.out.println("Parent3(int)");
    }
    void m1()
    {
        System.out.println("m1 from Super class");
    }
}
class Child3 extends Parent3
{
    int c1;
    // if user not created a constructor compiler will create parent constructor and super method
Child3()
{
    // super,super(),this,this()
    super(16); // Compiler will call default super() method
    System.out.println("Child3(int)");
}
Child3(int c1)
{
    super();
    this.c1=c1;
}
}
public class SuperThisExample
{
    public static void main(String[] args)
    {
        Parent3 obj1 = new Parent3(); // Parent3() created by compiler is called if there is no Constructor
Child3 obj2 = new Child3();
// in the constructor the first line inside constuctor will be super() call Prent class constructor
        Child3 obj3 = new Child3(12);
        System.out.println(obj3.c1);
        System.out.println(obj1.p1);
    }
}
