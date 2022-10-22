package com.bridgelabz.doubtsession;

//import com.bridgelabz.oops.Addition;

public class Calculator
{
//    public void calculate(CalculatorOperation objectOfCalculatorInterface){
//        if(objectOfCalculatorInterface instanceof Addition){
//            Addition addition=(Addition) objectOfCalculatorInterface;
//            addition.setResult(addition.getLeft()+addition.getRight());
//        }
//        else if(objectOfCalculatorInterface instanceof Subtraction){
//            Subtraction subtraction=(Subtraction) objectOfCalculatorInterface;
//            subtraction.setResult(subtraction.getLeft()-subtraction.getRight());
//        }

//    }

    public static void main(String[] args) {
//        Addition addition1 = new Addition(30,40);
        Calculator calculator1=new Calculator();
//        calculator1.calculate(addition1);
//        System.out.println(addition1.getResult());
        Subtraction subtraction1=new Subtraction(70,30);
//        calculator1.calculate(subtraction1);
        System.out.println(subtraction1.getResult());
    }
}
