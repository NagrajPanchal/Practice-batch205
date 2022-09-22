// In a single source file(.java file) we can have only one public class
// JDK => Platform specific installation
// JDK => JRE(Java Runtime environment) + Compiler
// JRE => If we install only JRE then we cannot compile our program but only run our program
// JRE => JVM (Java Virtual Machine)
// JVM => Interpreter
// When I run the program , source code(.java file) is taken by the compiler and this source code(.java file) is converted into byte code(.class file)
// .class file (byte code) is given to the JVM.
// JVM converts the byte code into machine readable code
// finally the code gets executed
// JVM calls the main method and starts the execution

// JVM Architecture
// Hello World Class
package com.bridgelabz.basiccore;

public class Demo
{
    static void hello()
    {
        System.out.println("Hello World");
    }
    public static void main(String[] args)
    {
        hello();
    }
}
