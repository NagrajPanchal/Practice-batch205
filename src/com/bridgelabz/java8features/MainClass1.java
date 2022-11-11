package com.bridgelabz.java8features;
interface InterfaceA{
    void m1();

    // Java-8 features
    default void m2(){
        System.out.println("default");
    }
    static void m3(){
        System.out.println("static");
    }

}
public class MainClass1
{
    public static void main(String[] args) {

    }
}
