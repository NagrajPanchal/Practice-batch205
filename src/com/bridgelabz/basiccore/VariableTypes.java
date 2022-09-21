// Variable Types
// Variable => It is a place which has a memory assigned to it and it can store some data

/*
3 types of Variables
1. Local Variable
2. Static variable
3. Instance variable

1. Local Variable :- Local variable is declare inside method or block
cannot access out side the method or block
if we use variable must initials

*/

package com.bridgelabz.basiccore;

public class VariableTypes
{
    static void variable(int x)
    {
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        variable(10);
    }
}
