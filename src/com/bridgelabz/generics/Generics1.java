package com.bridgelabz.generics;

//Generic is Specialy used for Type safety
// Generic will work with Non-Primitive data types
//2 types of generic => Method level and Class level
public class Generics1
{
    void printIntArray(int[] arr)
    {
        for (int x: arr)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    void printFloatArray(float[] arrFloat)
    {
        for (float x: arrFloat)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    void printBooleanArray(boolean[] arrBoolean)
    {
        for (boolean x: arrBoolean)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    //Method-level Generics
    // Method level generic will work for static as well as non-static method
   static <E>void printGenericsArray(E[] arrGeneric)
    {
        for (E x: arrGeneric)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        float[] arrFloat = {3.2F,1.3F,7.5f};
        boolean[] arrBoolean= {true,false,false};
        Integer[] arrayInt = {1,2,3,4,5,6};
        Float[] arrayFloat = {3.2F,1.3F,7.5f};
        Boolean[] arrayBoolean= {true,false,false};

        Generics1 generics1Object = new Generics1();
//        generics1Object.printIntArray(arr);
//        generics1Object.printFloatArray(arrFloat);
//        generics1Object.printBooleanArray(arrBoolean);

        printGenericsArray(arrayInt); // Static generic method
        generics1Object.printGenericsArray(arrayFloat);
        generics1Object.printGenericsArray(arrayBoolean);

    }
}
