// calculates the power and base value

package com.bridgelabz.basiccore.powerbase;
import java.util.Scanner;
public class PowerBase
{
    public static void main(String[] args) {

        int base,power,result;
        System.out.println("Enter the Base value :");
        Scanner sc = new Scanner(System.in);
        base = sc.nextInt();
        System.out.println("Enter the Power value :");
        power = sc.nextInt();
        result = (int) Math.pow(base,power);
        System.out.println("Results of Base^Power : " +base+ "^" +power+ " = " +result);
    }
}