package com.bridgelabz.doubtsession;
class OldString
{
    int age,height;
    String names,place;
    public OldString()
    {
        System.out.println("oldString constructor");
    }
    public OldString(String names, String place)
    {
        this.names = names;
        this.place = place;
    }
    public String toString()
    {
        return "Name : "+names+"\nPlace : "+place;
    }

    public OldString(int age, int height)
    {
        this.age = age;
        this.height = height;
    }
    void method()
    {
        System.out.println(age+height);
    }
}
class NewString extends OldString
{
    public NewString(String names, String place) {
        super(names, place);
    }

    public NewString() {

    }
    public NewString(int age, int height)
    {
        this.age = age;
        this.height = height;
    }



    public String toString()
    {
        return "Age : "+age+"\nHeight : "+height;
    }

    @Override
    void method() {
        int sum = age+height;
        System.out.println("Addition of age and height : "+sum);
    }
}

public class ToStringProgram
{

    public static void main(String[] args)
    {
        NewString newStringObject1 = new NewString();
        NewString newStringObject2 = new NewString("Name","Aurad");
        newStringObject1.names= "Nagraj";
        System.out.println(newStringObject1+"Constructor");
        System.out.println(newStringObject2+"Parametorized constructor and method overriding"+"Child class");

        OldString oldStringObject = new OldString("Nagraj","Panchal");
        System.out.println(oldStringObject+"Parametorized constructor and method overriding"+"Parent class");
        NewString newStringObject3 = new NewString(12,13);
        System.out.println(newStringObject3);
        NewString newStringObject4 = new NewString(1,2);
        newStringObject4.method();

        OldString oldStringObject5 = new OldString(4,5);
        oldStringObject5.method();

    }
}
