//Flip coin toss Heads and Tails

package com.bridgelabz.basiccore;

public class FlipCoinHeadsTails
{
    public static void main(String[] args)
    {
        if (Math.random() < 0.5) //Math random function if less then 0.5 it will print Head or else Tail
        {
            System.out.println("Heads");
        }
        else
        {
            System.out.println("Tails");
        }
    }
}
