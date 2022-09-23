// Power of two by Using for Power function

package com.bridgelabz.basiccore.powerbase;
import java.util.Scanner;
public class Power2
{
    static void powerof2()
    {
        System.out.print("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result,i;
        if (0<number && number<31 )
        {
            for (i = 1; i <= number; i++) {
                result = (int) Math.pow(2, i);
                System.out.println("Result : " + "2^" + i + "=" + result);
            }
        } else if (0>number)
        {
            System.out.println("-ve Number");
        } else
        {
            System.out.println("2^31 overflows an int");
        }
    }
    public static void main(String[] args)
    {
     powerof2();
    }
}
