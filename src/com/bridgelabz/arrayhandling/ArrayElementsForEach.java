// Java Program to print the elements of an array by using for Each

package com.bridgelabz.arrayhandling;
public class ArrayElementsForEach
{
    public static void main(String[] args) {
        int a[] = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        /* for each loop it will take first Array element
        & print then go Second Array Element
        goes on until array Elements */
        for (int b : a)
        {
            System.out.print(b+" ");
        }
    }
}
