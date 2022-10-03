// Array of Elements by using for Loop

package com.bridgelabz.arrayhandling; // Package Name
import java.util.Scanner; // import users defined Scanner class
public class ArrayElementsFor //Class name
{
    public static void main(String[] args) //main Class
    {
        System.out.print("Size of Array : "); // Print out put Statement
        Scanner scan =new Scanner(System.in); // Read inputs
        int size=scan.nextInt(); // Declaration and Initialization of variable by using read
        int a[] = new int[size]; // Declaration and Initialization of array by using read
        System.out.print("Enter the Array Elements : "); // Print out put Statement
        int i; //variable Declaration
        for (i= 0; i < size; i++) //for loop Size is Length of Array
        {
            a[i] = scan.nextInt(); // Read a Array Elements by using object scan reference of Scanner
        }
        System.out.print("Array of Elements : "); // Print out put Statement
        for (i= 0; i < size-1; i++) // for loop up to Second Last elements
        {
            System.out.print(a[i]+ ", "); // Print the Array of Elements in series
        }
        if ( i< size) // if Last element
        {
            System.out.print(a[i]); // Last Element display
        }
    }
}