// Constructor
// Types of Constructor
// Default Constructor or no-argument Constructor
// Parameterized Constructor
// Copy Constructor
// Static Constructor
// Private Constructor

// Default Constructors: Default constructor is the constructor which doesn't take any argument. It has no parameters.

// Constructor => It is a special method having same name as class name
// It is used to initialize an object.
// Compiler creates a default constructor when there is no constructor present in the class.
// When the constructor is already created , then compiler will not create any constructor.

package com.bridgelabz.practice;
import com.bridgelabz.oops.Dog;
public class ConstructorExample
{
    // Constructor => It is a special method having same name as Class name
    // It is Used to Initialize an object.
    // Compiler create a default  constructor when there is no constructor
    ConstructorExample()
    {
        System.out.println("I'm Constructor");

    }

    public static void main(String[] args)
    {
        ConstructorExample obj = new ConstructorExample();
//        Dog dog1 = new Dog(); // Instance Variable will give a memory
//        System.out.println(); // null
//        System.out.println(dog1.age); // 0
//        System.out.println(dog1.color); // null
//        System.out.println(dog1.VOICE);
//        dog1.VOICE = "Meow";
//        System.out.println(dog1.VOICE);
    }
}
