// Even and Odd Array of Elements

package com.bridgelabz.arrayhandling;

public class EvenOddArrayOfElements
{
    public static int evenSize = 0;
    public static int oddSize = 0;
    public static int[] even = new int[evenSize];
    public static int[] odd = new int[oddSize];
    public static int j,k;
    public static void evenOdd()
    {
        for(int i =0; i <DuplicateArrayOfElement.arr.length; i++)
        {
            if(DuplicateArrayOfElement.arr[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        for(int i =0; i <DuplicateArrayOfElement.arr.length; i++)
        {
            if(DuplicateArrayOfElement.arr[i] % 2 == 0)
                even[j++] = DuplicateArrayOfElement.arr[i];
            else
                odd[k++] = DuplicateArrayOfElement.arr[i];
        }
        System.out.print("Even Array Elements : ");
        System.out.println(even);
        System.out.print("Odd Array Elements : ");
        System.out.println(odd);
    }
    public static void main(String[] args)
    {
        DuplicateArrayOfElement.userDefinedArrayOfSizeAndElements();
        DuplicateArrayOfElement.arrayOfElements();
//        evenOdd();

    }
}
