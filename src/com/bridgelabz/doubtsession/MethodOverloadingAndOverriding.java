package com.bridgelabz.doubtsession;

class OldClass
{
    int x = 10;
    void method1() // method overloading
    {
        System.out.println("m() OldClass--> " +x);
    }
    void method1(int w) // method overloading
    {
        System.out.println("m(int w) OldClass--> " +w);
    }
    void method1(float y,int z) // method overloading
    {
        System.out.println("m(float y,int z) OldClass--> " +y+ " "+z);
    }
}
class NewClass extends OldClass
{
    void method1()
    {
        System.out.println("m() NewClass--> " +x);
    }

    public int adition(int x,int y)
    {
        int sum=x+y;
        return sum;
    }
    public double adition(double x, double y)
    {
        double sum=x+y;
        return sum;
    }
    public float adition(float x,float y)
    {
        float sum=x+y;
        return sum;
    }
    void adition()
    {
        System.out.println(adition(10,20));
        System.out.println(adition(12.2,12.4));
        System.out.println(adition(23.3f,17.2f));
    }

}

public class MethodOverloadingAndOverriding
{
    public static void main(String[] args)
    {
        NewClass newClassObject = new NewClass();
        newClassObject.method1(); //Overriding
        newClassObject.method1(10); // Inheritance
        newClassObject.method1(12.3f, 15);
        OldClass oldClassObject = new OldClass();
        oldClassObject.method1(); // Overriden
        newClassObject.adition();
    }

}
