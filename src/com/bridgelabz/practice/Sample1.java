package com.bridgelabz.practice;

import java.util.Random;

public class Sample1
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int y = random.nextInt(6);
        System.out.println(y);
       double res = Math.random()*20;
        System.out.println(res);
       double x = 10.59;
       double res2 = Math.floor(x);
       Math.round(4.7);
        System.out.println(res2);
    }
}
