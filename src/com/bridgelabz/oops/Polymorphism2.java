package com.bridgelabz.oops;

class Parent1
{
    Object ob = new Dog();
    int x =20;
    void m1() //Overriden
    {
        System.out.println("m1() of Parent Class");
    }
}
class Child1 extends Parent1
{
    int y = 30;
    void m2()
    {
        System.out.println("M2() of Child class");
    }
    void m1() //Overriding
    {
        System.out.println("m1() of child");
    }
}

public class Polymorphism2
{
    void methodA(Child1 ref1)
    {
        System.out.println("Method A");
    }
    void methodB(Parent1 ref2)
    {
        System.out.println("method B");
    }
    // Overriding
    // Whenever we inherit Parent class into child class ,we can override the inherited method.
    // Whenever we override the run-time object plays the role in determining which method should execute.
// Return type plays a role while overriding
// While overriding , the return type of 2 methods should be either same or Covarient(Parent-child relashaship)

    public static void main(String[] args)
    {
        Child1 obj = new Child1();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.m1();
        obj.m2();
        Parent1 obj1 = new Parent1();
        System.out.println(obj1.x);
        obj1.m1();

        // child class reference cannot hold parent class object
        // child1 obj3 = new Parent1();

        // Parent class reference can be hold child class object
        Parent1 obj4 = new Child1();
        obj4.m1(); // Only parent class access here method override
        System.out.println(obj4.x);
//        System.out.println(obj4.y);
//        obj4.m2();

        Polymorphism2 obj5 = new Polymorphism2();
        obj5.methodA(obj);
        obj5.methodB(obj1);
        obj5.methodB(obj4);

    }
}
