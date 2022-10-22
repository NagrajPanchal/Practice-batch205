package com.bridgelabz.oops;

// Abstract class
// We will use abstract class when we know partial implementations
// Abstract class is used for 0% to 100% Abstraction.
// Abstract class contains Abstract methods(methods without body) as well as concrete method(methods with implementation)
// We need to mention abstract keyword while declaring abstract methods. Abstract methods cannot be private.
// Abstract class can contain any kind of variables.
// The child class of abstract class can override either all or some of the abstract methods. It is not mandatory to override all the abstract methods.
// Abstract class contains a constructor because the variables of abstract class has to be initialized.
// We cannot create an object of Abstract class

abstract class Demo1
{
    int x =10;
    static int y = 20;
    void m1()
    {
        System.out.println("m1");
    }
    static int m2()
    {
        System.out.println("m2()--> static method");
        return m2();
    }

    abstract void m3();

    abstract int m4(int z);
}

abstract class ChildDemo1 extends Demo1
{
    int w;

    ChildDemo1()
    {
    }
    public ChildDemo1(int w) {
        this.w = w;
    }
    @Override
    void m3()
    {
        System.out.println("m3 of childDemo1 ");
    }
}

class ChildDemo2 extends ChildDemo1
{
    ChildDemo2()
    {

    }
    @Override
    void m1() {
        System.out.println("m1 of ChildDemo2");
    }

    @Override
    void m3() {
        System.out.println("m3 of ChildDemo2");
    }

    @Override
    int m4(int z)
    {
        z=z+4;
        return z;
    }

}

public abstract class Abstraction4
{
    public static void main(String[] args)
    {
        Demo1 demo1Object = new ChildDemo2();
        demo1Object.m1();
        demo1Object.m3();
        System.out.println(demo1Object.m4(10));
        System.out.println(demo1Object.x);
        System.out.println(Demo1.y);

    }

}
