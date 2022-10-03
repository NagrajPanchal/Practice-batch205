package com.bridgelabz.practice;


public class VariableTypes {
//    static int v;    // 0
//    static String v2;  // null // non-primitive
//    static float f;  // 0.0F

    public static int staticVar1;  // 0


    // 3 types
    // Local variable
    // static variable
    // instance variable

    // Local variable
    // Variables declared inside a method or a block is called local variable
    // If we are using the local variable , we must initialize it.
    // Local variable cannot be accessed outside a method or a block in which it is declared.


    // Static Variable
    // Static variable is a class-level variable
    // Static variable will get the memory when class loading happens by the class loader.(class loader takes the .class file and loads it into the method area of JVM memory)
    // Static variable will be loaded in the method area.
    // There will be only one copy of this variable at class level shared to all the members of the class and across all objects.
    // If at any point the value of the static variable is changed, it will change for all the members of a class.
    // It is not mandatory to initialize a static variable. If we are not initializing then it will take default value based on the data type.
    // We have to use static keyword for declaring static variable
    // Static variable will be declared inside the class but outside of any of the methods.
    // Within the same class, static variable can be accessed directly
    // Outside a class ,static variable will be accessed using class name.


    // Instance Variable
    // Instance variable is a object-level variable
    // Instance variable will get the memory when Object is created and memory is allocated.
    // Instance variable will be loaded in the heap area
    // There will be only one copy of this variable at object level and it is independent of other objects.
    // Within the same class or outside the class, instance variable can be accessed through object only.
    // If at any point the value of the instance variable is changed, it will change only for that object
    // It is not mandatory to initialize an instance variable. If we are not initializing then it will take default value based on the data type.
    // Instance variable will be declared inside the class but outside of any of the methods.


    static void m1() {
        System.out.println("Inside m1() starts => "+staticVar1); // 40
        int x = 9;
        float y = 0;
        staticVar1 = 20;
        System.out.println("x in m1() =>"+x);
        System.out.println("y in m1() =>"+y);
        System.out.println("Inside m1() ends => "+staticVar1); // 20

    }

    public static void main(String[] args) {

        System.out.println("main method starts => "+staticVar1); // 10
        int x = 9;
        System.out.println(x);
        staticVar1 = 40;
        m1();
        System.out.println("main method ends => "+staticVar1); // 20


    }
}
