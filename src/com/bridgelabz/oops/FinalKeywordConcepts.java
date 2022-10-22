package com.bridgelabz.oops;
class Parent2
{
    void methodA()
    {
        System.out.println("methodA");
    }
}
class Child2 extends Parent2
{
//    void methodA()
//    {
//        System.out.println("methodA child2");
//    }
}
public class FinalKeywordConcepts
{
    static final int x = 20;
    final int y = 30;
// if a variable is final we cannot change its value
    //if a method is final we connot ovarride it
    // if a class is final we cannot inherite class
    public static void main(String[] args)
    {
        Child2 obj = new Child2();
        obj.methodA();
    }
}
