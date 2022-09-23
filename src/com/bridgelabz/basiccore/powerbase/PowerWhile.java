// Power of 2 by using while Loop

package com.bridgelabz.basiccore.powerbase;
public class PowerWhile
{
    public static void main(String[] args) {
        int num = 4, x = 2;
        System.out.println("Required Power is " + power(x,num));
    }
    static int power(int num, int x) {
        int result = 1;
        while (x > 0) {
            result *= num;
            x--;
        }
        return result;
    }
}