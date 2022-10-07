package com.bridgelabz.practice;

public class Sample2
{
    public static void main(String[] args)
    {
        System.out.println("Static Variable types of class " + VariableTypes.staticVar1);
        //Accessing Non-Static method outside the Class
        MethodTypes obj =new MethodTypes(); // object created for outside the class
        obj.m2(); // Outside the class created the object reference access non-static method
    }
}
