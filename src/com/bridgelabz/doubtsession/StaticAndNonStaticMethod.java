package com.bridgelabz.practice;

public class StaticAndNonStaticMethod
{
    static int number;
    int number1;
    public static void staticMethod()
    {
        System.out.println("Static Method");
        System.out.println(number);
        number = 10;
        System.out.println(number);
        StaticAndNonStaticMethod non = new StaticAndNonStaticMethod();
        non.number1 = 30;
        System.out.println(non.number1);

    }

    void nonStaticMethod()
    {
        System.out.println("Non Static Method");
        System.out.println(number1);
        number1 = 20;
        System.out.println(number1);
        staticMethod();
    }
    public static void main(String[] args)
    {
        staticMethod();
        StaticAndNonStaticMethod non = new StaticAndNonStaticMethod();
        non.nonStaticMethod();
    }
}
