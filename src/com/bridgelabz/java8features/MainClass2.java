package com.bridgelabz.java8features;

// Java-8 features
// Functional Interface => Any interface having only one abstract method is called functional interface
// Lambda Expressions => Min. requirement for implementing lambda is functional interface. It reduces the code.
// Stream API => Whenever we want to do some operations on group of data (array , Collection), we will use stream API.
// Consumer, Predicate , Function , Supplier  => Predefined Functional Interfaces


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

//        System.out.println("sum => " + sum.calculate(3, 6));
//        System.out.println("Product => "+prod.calculate(4,7));

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


    }
    Consumer consumer;
}
