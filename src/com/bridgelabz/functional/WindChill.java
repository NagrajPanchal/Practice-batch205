// WindChill temperature t and the wind speed v the
//National Weather Service defines the effective temperature (the wind chill) to be:
// t => temperature
// v => speed
// W => National Weather Service

package com.bridgelabz.functional;

import java.util.Scanner;
public class WindChill
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of temperature t : ");
        int t = scanner.nextInt();
        System.out.print("Enter the value of wind speed v : ");
        int v = scanner.nextInt();
        double v1 = 0.16;
        double power = Math.pow(v,v1);
        if(t>50 || (v>120 || v <3))
        {
            double w = (double) (35.74+(0.6215*t)+((0.4275*t)-(35.75))*power);
            System.out.println("National Weather Service w : "+w);
        }
        else
        {
            System.out.println("Invalid temperature and speed values ");
        }
    }
}
