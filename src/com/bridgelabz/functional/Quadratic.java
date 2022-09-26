/* Quadratic equation a*x*x + b*x + c.
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
*/

package com.bridgelabz.functional;
import java.util.Scanner;
import java.lang.Math;
public class Quadratic
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("--:Enter 3 inputs :--");
        System.out.print("a : ");
        a = scanner.nextInt();
        System.out.print("b : ");
        b = scanner.nextInt();
        System.out.print("c : ");
        c = scanner.nextInt();
        double delta = b*b-4*a*c;
        double squart = Math.sqrt(delta);
        double root1x = (-b+(squart))/(2*a);
        double root2x = (-b-(squart))/(2*a);
        double equation = a*root1x*root2x+b*root1x+c;
        System.out.println("Delta : "+delta);
        System.out.println("Square Root is : "+squart);
        System.out.println("Root 1 of x : "+root1x);
        System.out.println("Root 2 of x : "+root2x);
        System.out.println("roots of the equation is : "+equation);
    }
}
