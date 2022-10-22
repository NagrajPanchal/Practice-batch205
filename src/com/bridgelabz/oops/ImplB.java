package com.bridgelabz.oops;

public class ImplB implements InterfaceA {
    @Override
    public void m1() {
        System.out.println("m1() Abstract method from interfaceA and implements in ImplB");
    }

    @Override
    public int m1(int x, int y) {
        return x / y;

    }
}
