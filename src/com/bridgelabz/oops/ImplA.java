package com.bridgelabz.oops;

public class ImplA implements InterfaceA
{
    @Override
    public void m1()
    {
        System.out.println("m1() implements from InterfaceA ");
    }

    @Override
    public int m1(int x, int y)
    {
        return x*y;
    }
}
