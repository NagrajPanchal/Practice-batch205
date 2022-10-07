// 2 types of Method
// Static method & Non Static Method
// Static method are class level method
// Inside the Class these can be accessed directly
// Out side the class these can be accessed with class  name

// Non-static method are object level methods
// inside the Class or Outside the Class these methods can only be the access by using Object


package com.bridgelabz.practice;

public class MethodTypes
{
    // Instance variable or Non-static variable
    int instanceVar; // Instance variable
    static int staticVar; // Static variable
    static void m1()
    {
        System.out.println("Static Method");
        m1(); // Static method
        System.out.println(staticVar);
        MethodTypes obj2 =new MethodTypes(); // Object Created for instance method
        System.out.println(obj2.instanceVar); // Instance Variable accessed by using object
    }
    void m2() // Non-static method
    {
        System.out.println("Non -Static Variable Method");
        System.out.println(instanceVar); // obj1 instanceVar
        System.out.println(staticVar); // Static variable
    }
    public static void main(String[] args)
    {
        m1(); // Static Method
        MethodTypes obj =new MethodTypes(); // Object Created for instance method or Non-static method
        System.out.println(obj.instanceVar); // By accessed using Object reference
        obj.m2(); // by using Object reference
        MethodTypes obj2 =new MethodTypes(); // Created object for instance or Non-static method
        System.out.println(obj2.instanceVar); // Obj2 instance
        obj2.m2(); // Obj2 Non-static method object reference

    }
}
