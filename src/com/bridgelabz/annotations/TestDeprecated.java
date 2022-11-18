package com.bridgelabz.annotations;

class A
{
    void m1()
    {
        System.out.println("Hello m1 Method");
    }
    @Deprecated
    void m2()
    {
        System.out.println("Hello m2 Method");
    }
}
public class TestDeprecated
{

    public static void main(String[] args)
    {
A a = new A();
a.m1();
a.m2(); // Deprecated
    }
}
