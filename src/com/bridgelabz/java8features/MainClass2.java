package com.bridgelabz.java8features;

// Java-8 features
// Functional Interface => Any interface having only one abstract method is called functional interface
// Lambda Expressions => Min. requirement for implementing lambda is functional interface. It reduces the code.
// Stream API => Whenever we want to do some operations on group of data (array , Collection), we will use stream API.
// Consumer, Predicate , Function , Supplier  => Predefined Functional Interfaces

// Consumer => It represents an operation that accepts a single argument and returns no result.
// Predicate => It represents a predicate (boolean-valued function) of one argument.
// Function => It represents a function that accepts one argument and returns a result.(input and output)
// Supplier => It represents a supplier of results.(NO input only supplier)


import java.util.function.Consumer;

interface IMathFunction{
    int calculate(int x,int y);

    static void printCalculation(int x,int y,String functionality,IMathFunction ref)
    {
        System.out.println(functionality + "of " + x +"and"+ y + ref.calculate(10,20));
    }
}

class Impl1 implements  IMathFunction{
    @Override
    public int calculate(int x, int y) {
        return x+y;
    }
}
class Impl2 implements  IMathFunction{
    @Override
    public int calculate(int x, int y) {
        return x*y;
    }
}
class ConsumerInterfaceExample
{
    static void printMessage(String myName) {
        System.out.println(myName);
    }
    static void printValue(int val) {
        System.out.println(val);
    }
}

    public class MainClass2
{
    public static void main(String[] args)
    {
        IMathFunction sum = (a,b) -> a+b; //lambda expression
        IMathFunction sum3 = Integer::sum;
        IMathFunction prod = (a,b) -> a*b;
        IMathFunction demoLogic = (a,b) -> {
            int sum1 = a*b +b;
            int res = sum1 % 5;
            return res;
        };
        IMathFunction con = (a,b) -> a;

        System.out.println("sum => " + sum.calculate(3, 6));
        System.out.println("Product => "+prod.calculate(4,7));

        System.out.println("sum -> " + sum.calculate(10,20));
        System.out.println("sum3 -> " + sum3.calculate(11,22));
        IMathFunction.printCalculation(10,3,"Sum3",sum3);
        System.out.println("Products -> " + prod.calculate(10,20));
        IMathFunction.printCalculation(10,3,"DemoLogic",demoLogic);

//        IMathFunction ref1 = new Impl1();
//        System.out.println("sum =>" +ref1.calculate(4, 6));
//
//        IMathFunction ref2 = new Impl2();
//        System.out.println("Product => "+ref2.calculate(4,7));

        System.out.println("************ Consumer ***************");
        Consumer<String> consumer1 = ConsumerInterfaceExample::printMessage;
        consumer1.accept("Nagraj");
        Consumer<Integer> consumer2 = ConsumerInterfaceExample::printValue;
        consumer2.accept(12);

    }

}
