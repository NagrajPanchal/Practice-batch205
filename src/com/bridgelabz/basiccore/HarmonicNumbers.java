// Nth Harmonic Number

package com.bridgelabz.basiccore;
import java.util.Scanner;
public class HarmonicNumbers
{
    static void harmonicNumber()
    {
        int num,i;
        float sum = 0;
        float result = 0;
        System.out.print("Enter Nth Number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if(num!=0) {
            for (i = 1; i <= num; i++)
            {
                result = (float) 1 / i;   // Harmonic Series list
                System.out.println(i+"). "+result + ", ");
                sum = sum + result;   // Sum for harmonic series
            }
            System.out.print("1st to " + --i +" term Harmonic sum Value : "+ sum);
        }
        else {
            System.out.println("Invalid number");
        }
    }
    public static void main(String[] args)
    {
    harmonicNumber();
    }
}
