// Smallest Array of Number

package com.bridgelabz.arrayhandling;
public class SmallestArrayElement
{
    void smallestNumber()
    {
        int[] arr = {11,20,30,40,50,60};
//        int[] arr =new int[10];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[3] = 10;
//        arr[4] = 40;
//        arr[5] = 50;
//        arr[6] = 80;
//        arr[8] = 23;
//        arr[9] = 25;
        int min = arr[0];
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(min + " is smallest Array of Element");
    }
    public static void main(String[] args)
    {
        SmallestArrayElement small = new SmallestArrayElement();
        small.smallestNumber();
    }
}
