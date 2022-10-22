package com.bridgelabz.oops;

// Hididng the implementation details and just showing necessary details is called Abstraction
// 2 ways of achieving abstraction
// Interface and Abstract class

// Interface
// We will use interface when we don't know any of the implementations
// Interface is used for 100% Abstraction.
// Interface contains Abstract methods
// The abstract methods are bydefault public and abstract. So we don't need to mention public and abstract keywords while declaring.
// Interface can contain variables but they will always be public,static and final.So we don't need to mention public,static and final keywords while declaring.
// From Java 1.8V onwards, Interface can contain static methods as well as default methods.
// From Java 1.9V onwards, Interface can contain private methods also.
// private ,static and default methods must contain the implementation. These methods cannot be abstract(without body).
// The implementation class of an interface must override all the abstract methods of the interface . It is mandatory.
// Interface does not contain a constructor
// We cannot create an object of Interface
// private method can only be called inside the interface through default method implementation
// default method can be overridden in the implementation classes.
// static method can only called using Interface name.

// Abstract methods
// Methods with only declarations and without any implementation(without any method body)

// Example:- Calculator(Interface) => calculate();(abstract method) => Sum implements Calculator => calculate(){ Impl. related to Sum}  , Multiply implements Calculator => calculate(){ Impl. related to Product}

interface Calculator
{
    int calculate(int a, int b);

}
class Sum implements Calculator
{
    @Override
    public int calculate(int a, int b)
    {
        return a+b;
    }
}

class Product implements Calculator
{
    @Override
    public int calculate(int a, int b) {
        return a*b;
    }

    public Product() {
    }
}
interface Interface1 {
    void m1(); // public and abstract

    void m2();

    default void m4() {
        System.out.println("default method m4");
//        m5();
    }

    static void m3() {
        System.out.println("static method m3()");
    }
// From Java 1.9V onwards, Interface can contain private methods also.
//    private void m5()
//    {
//        System.out.println("private method m5()");
//    }

}

class ImplClass1 implements Interface1 {

    @Override
    public void m1() {
        System.out.println("m1 implclass1");
    }

    @Override
    public void m2() {
        System.out.println("m2 implclass1");
    }

    @Override
    public void m4() {
        System.out.println("default method in implclass1");
    }

    }

class ImplClass2 implements Interface1 {

    @Override
    public void m1() {
        System.out.println("m1 implclass2");
    }

    @Override
    public void m2() {
        System.out.println("m2 implclass2");
    }

   }

public class Abstraction {


    public static void main(String[] args) {
//         ImplClass1 obj1 = new ImplClass1();
//         obj1.m1();
//         obj1.m2();
//
//         ImplClass2 obj2 = new ImplClass2();
//         obj2.m1();
//         obj2.m2();


        Interface1 obj3 = new ImplClass1();
        obj3.m1();
        obj3.m2();

        Interface1 obj4 = new ImplClass2();
        obj4.m1();
        obj4.m2();

        Interface1.m3(); // static method can only be accessed using the Interface name
        // static method of interface will not be inherited.
        // ImplClass1.m3();

        obj3.m4();

        obj4.m4();


        Calculator sum = new Sum();
        Calculator product = new Product();
        System.out.println(sum.calculate(3,7)); // 10
        System.out.println(product.calculate(5,9)); // 45



    }
}
