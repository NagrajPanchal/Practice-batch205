package com.bridgelabz.oops;
// private method cannot be inherited and hence it cannot be overridden.
// static method will be inherited but it cannot be overridden.
class Parent4
{
    // private method cannot be inherited and hence it cannot be overridden.
    private void m1()
    {
        System.out.println("m1 of Parent4");
    }
    //static method will be inherited

    static void m2()
    {
        System.out.println("static m2 of Parent4");
    }
}
class Child4 extends Parent4
{
    static int x = 10;
    private void m1()
    {
        System.out.println("m1 of Child4");
    }
    // method Hiding
    static void m2()
    {
        System.out.println("static m2 of Child4");
    }
}
public class Ploymorphism5
{
    public static void main(String[] args)
    {
        Parent4 parent4Object = new Parent4();
        Child4 child4Object = new Child4();
        Parent4.m2(); //static method call by class name
        Child4.m2(); // inherited static method call by class name
        parent4Object.m2(); //call by object of static method
        child4Object.m2(); // call by object & inherited

        Child4 child4Object2 = new Child4();
        System.out.println(child4Object.x); // 10
        System.out.println(child4Object2.x); // 10
        child4Object.x = 30;
        System.out.println(child4Object.x); // 30
        System.out.println(child4Object2.x); // 30 static variable single copy access class level

        System.out.println("*****************");
        Parent4 parent4Object3 = new Child4();
        parent4Object3.m2();// call parent class method hiding child class


    }
}
