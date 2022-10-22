package com.bridgelabz.doubtsession;

public class Adition //implements CalculatorOperation
{
    // a+b=c
    // a is called left operand
    // + is called operator
    // b is called right operand
    // c is called result
    private double left;
    private double right;
    private double result = 0.0;

    public Adition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
