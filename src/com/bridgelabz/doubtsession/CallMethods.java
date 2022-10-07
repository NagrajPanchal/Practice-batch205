// Static and Non-Static methods

package com.bridgelabz.doubtsession; // Package
public class CallMethods // Class
{
    public static void main(String[] args) // Main Method
    {
        StaticAndNonStaticMethod.staticMethod(); // Static Method : Outside the class by using class name
        StaticAndNonStaticMethod non = new StaticAndNonStaticMethod(); // Object Created
        non.nonStaticMethod(); // Non-Static Method : Outside the class create object by using object reference
    }
}
