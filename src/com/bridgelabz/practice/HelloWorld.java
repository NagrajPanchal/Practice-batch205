package com.bridgelabz.practice;

public class HelloWorld {




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
// There is a main thread which is there in the JVM . This main thread is responsible for calling the main method

// JVM Architecture






    static boolean method3(){
        System.out.println("method 3");
        return true;
    }

    static int sum(int x,int y){
        int sum = x+y;
        System.out.println(sum);
        return sum;
    }


    // method
    // syntax
    static void method2(int x){
        int a = 40;
        System.out.println(x);
        System.out.println("method2");
        if(x%2 == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }

    static void method1(int z){
        int x = 10;
        System.out.println(x);
        int y = 40;
        System.out.println(y);
        System.out.println(z);
        System.out.println("method1");
    }


    // Main thread
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("ABC");
        int x =10;
        System.out.println(x);
        x = 20;
        System.out.println(x);
        method1(30);
        method2(4);
        method2(5);
        method2(4);

        int result = sum(5,8);
        System.out.println(result);
        boolean res = method3();
        System.out.println(res);

    }



}

