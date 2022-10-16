package com.bridgelabz.practice;

public class MethodTypes2
{
    public static int staticVar;
    int instanceVar;
    static void method1()
    {
        System.out.println("static Method");
        int staticVar = 10;
        System.out.println(staticVar);
        MethodTypes2 mt2 = new MethodTypes2();
        System.out.println(mt2.staticVar);
        System.out.println(mt2.instanceVar);
        System.out.println(MethodTypes2.staticVar);
        System.out.println();
    }
    void m3()
    {
        System.out.println("hi i'm m3()");
    }
    void method2(int instanceVar)
    {
        m3();
        System.out.println("Non-static Method");
        int staticVar = 20;
        System.out.println(staticVar);
        System.out.println(this.instanceVar);
        System.out.println(MethodTypes2.staticVar);
        MethodTypes2 mt4 = new MethodTypes2();
        System.out.println(mt4.instanceVar);
    }
    public static void main(String[] args)
    {
        method1();
        MethodTypes2 mt3 = new MethodTypes2();
        mt3.method2(12);
    }
}
