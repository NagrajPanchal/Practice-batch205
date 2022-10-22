package com.bridgelabz.oops;

// Var-agrs method
public class VariableArgs {
    static void m1(int ...vals) {
        System.out.println("m1");
        for (int x:vals)
        {
            System.out.print(x + "......");
        }
    }

    public static void main(String[] args) {
        m1();
        m1(3);
        m1(3,6);
        m1(3,5,7);
        m1(7,8,9,2);
        m1(1,2,3,4,5);
        m1(9,8,6,7,5,4);
    }
}
