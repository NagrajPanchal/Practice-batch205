package com.bridgelabz.oops;

public class Abstraction3 {

    public static void main(String[] args) {

        InterfaceA obj1 = new ImplA();
        obj1.m1();
        System.out.println(obj1.m1(2,3));
        InterfaceA obj2 = new ImplB();
        obj2.m1();
        System.out.println(obj2.m1(10,5));
    }
}
