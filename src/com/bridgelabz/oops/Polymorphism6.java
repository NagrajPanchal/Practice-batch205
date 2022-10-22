package com.bridgelabz.oops;

//Private < default < protected < public
// while overriding we can increase the scope we cannot reduce the scope.
class Parent5
{
    private void m1()
    {
        System.out.println("m1() of Parent5");
    }
    void m2()
    {
        System.out.println("m2() of Parent5");
    }
    protected void m3()
    {
        System.out.println("m3() of Parent5");
    }
    public void m4()
    {
        System.out.println("m4() of Parent5");
    }
}
// private method cannot inherited and hence it cannot be overridden
class Child5 extends Parent5
{
    //we can take default,protected and public
    // we cannot take private
    void m2()
    {
        System.out.println("m2() of Child5");
    }
    // we can take protected and public
    // we cannot take private and default
    public void m3()
    {
        System.out.println("m3() of Parent5");
    }
    // we can take public
    // we cannot take private , default and protected
    public void m4()
    {
        System.out.println("m4() of Parent5");
    }
}
public class Polymorphism6
{

    public static void main(String[] args)
    {

    }
}
