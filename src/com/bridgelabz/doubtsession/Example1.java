package com.bridgelabz.doubtsession;

interface casio // interface
{
    int cal(int x,int y); //Abstraction
}
class res implements casio
{
    @Override
    public int cal(int x, int y) // method override
    {
        return x+y;
    }
}
interface Interface1
{
    void m1();
    static void m2()
    {
        System.out.println("m2() --> Interface");
    }
}
class res1 implements Interface1
{
    @Override
    public void m1()
    {
        System.out.println("m1() --> Abstract interface");
    }
}
class VarClass
{
    int x;
    String name,place;

    public VarClass()
    {
        System.out.println("Constructor Parent");
    }

    public VarClass(int ...x)
    {
        System.out.println("var-Args");
        for (int y: x)
            System.out.print(y+"...");
    }
    void m1(String name,String place)
    {
        this.name=name;
        this.place=place;
    }

    @Override
    public String toString()
    {
        return
                "Name : " + name + '\n' +
                "Place : " + place + '\n';
    }
}
class Varclass2 extends VarClass
{
    public Varclass2()
    {
        System.out.println("Constructor");
    }
    public Varclass2(int... x)
    {
        super(x);
    }


}
public class Example1
{
    public static void main(String[] args)
    {
        Interface1 interface1Object = new res1();
        interface1Object.m1(); // Abstarct method

        casio casioObject = new res();
        System.out.println(casioObject.cal(1,2));
        Interface1.m2(); //Static method

        VarClass varClass = new VarClass();
        System.out.println(varClass);
        Varclass2 varclass1Object = new Varclass2();
        System.out.println(varclass1Object);
        Varclass2 varclass2Object = new Varclass2(12,12,13,14);
        System.out.println(varclass2Object);
        varclass2Object.name = "Nagraj";
        varclass2Object.place = "Panchal";
        System.out.println(varclass2Object);

    }
}
