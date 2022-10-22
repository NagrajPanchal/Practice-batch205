package com.bridgelabz.doubtsession;

class Fruits
{
    String x = "Hummm...";
    void eat()
    {
        System.out.println(x);
    }
}
class Apple extends Fruits
{
    String y = "Wawooo....";
    void eat()
    {
        System.out.println(y);
    }
}
class TestResults
{
    void eat(Fruits fruits)
    {
        System.out.println("Fruits");
    }
    void eat(Apple apple)
    {
        System.out.println("Apple");
    }
    void eat(int x,float y)
    {
        System.out.println(x);
        System.out.println(y);
    }
    void eat(float x,int y)
    {
        System.out.println(x);
        System.out.println(y);
    }
}

public class PolymorphisumConcepts
{
    public static void main(String[] args)
    {
        Fruits fruitsObj = new Fruits();
        Apple appleObj = new Apple();
        TestResults obj = new TestResults();

        obj.eat(fruitsObj);
        obj.eat(appleObj);
        obj.eat(12.2F,2);
        obj.eat(12,12.2F);
        //obj.eat(12,12); // Ambiguity


    }
}
