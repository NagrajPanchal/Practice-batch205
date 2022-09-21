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

2. Static Variable :- Static variables are allocated memory in data segment, not stack segment. See memory layout of C programs for details. 3) Static variables

3. Instance variables :- The variables that are declared inside the class but outside the scope of any method are called instance variables
Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block.
 Instance variables hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state

*/
// Variables Types
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
