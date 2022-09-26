//Flip coin toss Heads and Tails with Percentage

package com.bridgelabz.basiccore;
import java.util.Scanner;
import java.lang.Math;
public class FlipCoinHeadsTails
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Flip the coin numbers of times : ");
        int number = scanner.nextInt();
        float countHeads=0.0f;
        float countTails=0.0f;
        for(int i=0;i<number; i++)
        {
            float flipCoin = (float) Math.random();
            if (flipCoin < 0.5 ) //Math random function if less then 0.5 it will print Head or else Tail
            {
                countHeads++;
            } else
            {
                countTails++;
            }
        }
        System.out.println("Numbers of Heads: "+countHeads);
        System.out.println("Numbers of Tails: "+countTails);
        float heads = ( countHeads / number)*100;
        float tails = ( countTails / number)*100;
        System.out.println("Percentage of Head : " +heads+ "%");
        System.out.println("Percentage of Tail : " +tails+ "%");
    }
}