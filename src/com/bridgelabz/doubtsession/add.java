package com.bridgelabz.doubtsession;

public interface add
{
    class Adition
    {
        // a+b=c
        // a is called left operand
        //+ is clalled Operater
        //b is claeed Operand
        // c is claled result

        private double left;
        private double right;
        private double result = 0.0;

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
}
