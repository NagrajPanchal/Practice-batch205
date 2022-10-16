package com.bridgelabz.oops;

import java.util.Scanner;

public class ObjectClass
{
    public static void main(String[] args)
    {
    // Object class
    //Object class is the parent class of every class in java(whether it is Pre-defind or User defind class)
    Object obj = new Object();
    String obj2 = new String();
    Scanner scanner = new Scanner(System.in);

    Dog dog1 = new Dog();
        System.out.println(dog1.length);
        System.out.println(dog1.weight);
        System.out.println(dog1.height);
        dog1.equals("ABC");

        Dog dog3 = new Dog(12,25,5);
        System.out.println(dog3.height);
        System.out.println(dog3.weight);
        System.out.println(dog3.length);

        Dog dog4 = new Dog("Pitbull",13,"White");
        System.out.println(dog4.breed);
        System.out.println(dog4.age);
        System.out.println(dog4.color);
        System.out.println("equals");

        // Parent class reference can hold child class object
        // equals of object class
        // Parent sent os of Dog class
        // Parameter expected is of Object class
        System.out.println(dog3.equals(dog4));
        System.out.println(dog1.equals(dog3));

// HashCode is generated based on the values of instance variables of an objects
// if the 2 objects are having same instance variable values then the hasCode will be Same.

        System.out.println(dog1.hashCode());
        System.out.println(dog3.hashCode());
        System.out.println(dog4.hashCode());


    }
}
