package com.bridgelabz.doubtsession;

public class GenericAddition<T,R,E>
{
    T intVar;
    R floatVar;
    E doubleVar;
    E addition;

    public GenericAddition() {
    }

    public GenericAddition(T intVar, R floatVar, E doubleVar)
    {
        this.intVar = intVar;
        this.floatVar = floatVar;
        this.doubleVar = doubleVar;

    }
    void Addition(E addition)
    {
        System.out.print("Addition : ");
//        System.out.println(addition = intVar + floatVar + doubleVar);

    }

    @Override
    public String toString()
    {
        return "GenericAddition  " +
                "intVar = " + intVar +
                "floatVar = " + floatVar +
                "doubleVar = " + doubleVar;
    }

    public static void main(String[] args)
    {
        GenericAddition <Integer,Float,Double> genericAdditionObject = new GenericAddition<>(12,12.2F,12.12);
        System.out.println(genericAdditionObject);
        System.out.print("Addition : ");
        System.out.println(genericAdditionObject.addition = genericAdditionObject.intVar + genericAdditionObject.floatVar + genericAdditionObject.doubleVar);

    }
}
