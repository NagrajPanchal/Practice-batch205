//Flip coin toss Heads and Tails

package com.bridgelabz.basiccore;
import java.util.Scanner;
public class FlipCoinHeadsTails
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Flip the coin numbers of times : ");
        int number = scanner.nextInt();
        int totalCount=0,countHeads=0,countTails=0;
        for(int i=0;i<number; i++)
        {
            if (Math.random() < 0.5) //Math random function if less then 0.5 it will print Head or else Tail
            {
                countHeads++;
            } else
            {
                countTails++;
            }
            totalCount++;
        }
        System.out.println("Numbers of Heads: "+countHeads);
        System.out.println("Numbers of Tails: "+countTails);
        float Head = (float)((countHeads % totalCount) * 10);
        float Tails = (float)((countTails % totalCount) * 10);
        /*
        int Head = ((countHeads / totalCount) * 100);
        int Tails = ((countTails / totalCount) * 100);
        */
        /*
        float Head = (float)((countHeads / totalCount) * 100);
        float Tails = (float)((countTails / totalCount) * 100);
        */
        /*
        double Head = (countHeads/totalCount)*100;
        double Tails = (countTails/totalCount)*100; */
        System.out.println("Percentage of Head : " +Head+"%");
        System.out.println("Percentage of Tail : " +Tails+"%");
    }
}

/*
Example::::::

n Scanner function



10  ===    0.23  0.45 0.78  0.98 0.75 0.47 0.21 0.85 0.569 0.54

random 10 times

less than 0.5  6
above 0.5      4

6/10 * 100 = 60%
4/10 * 100 = 40%
 */
