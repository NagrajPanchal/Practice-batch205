package com.bridgelabz.exceptions;

// Exception => Unwanted code which causes abnormal termination of the program
// Exception Types => Checked and Unchecked Exceptions
// Checked Exception => These exceptions are checked by the compiler at the time of compilation. Hence these are compile time exceptions
//  There are two ways of handling checked exceptions => 1> using try-catch block , 2> using throws keyword
// Unchecked Exception => These exceptions occur at run-time.
//  To handle unchecked exception we can use try-catch block.

// Checked and Unchecked Exceptions
//                                       Throwable

//               Exception                                                    Error
// RuntimeException   IOException      Interrupted....              VMError LinkageError AssertionError...
// StackOverflow      // EOFException
// OutofMemoryError   // FileNotFoundException
// Unchecked
// AE
// NPE
// CCE
// IndexOutofBoundException
// AIOOBE
// SIOOBE
// IllegalArgumentException
// NumberFormatException
public class Exception1 {

    public static void main(String[] args) {
        System.out.println("main starting");
        int x = 23;
        System.out.println(x);
        int y = 3;

        try {
            int div = x / y;
        }catch(Exception e){
            System.out.println("catch block"+e);
        }

        System.out.println("main ending");
    }
}
