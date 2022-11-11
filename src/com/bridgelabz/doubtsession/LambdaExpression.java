package com.bridgelabz.doubtsession;

interface ILambda
{
    int[] sum(int ...y);
}
class LambdaClass implements ILambda
{

    @Override
    public int[] sum(int ...y)
    {
        int[] res = y;
    return res;
    }
}

public class LambdaExpression
{

    public static void main(String[] args)
    {
        LambdaClass lambdaClass = new LambdaClass();
        System.out.println("sum : " + lambdaClass.sum(10,20));


        ILambda result = (y) -> y;
//        LambdaClass xyz = (a,b) -> a+b;
        System.out.println("Sum : " + result.sum(11,20));
    }
}
