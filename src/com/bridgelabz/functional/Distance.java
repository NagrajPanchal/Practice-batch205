/* command-line arguments x and y
Euclidean distance from the point (x, y) to the origin (0, 0).
 The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function */
// Run -> Edit Configuration -> Add Arguments -> Run
package com.bridgelabz.functional;
import java.lang.Math;
public class Distance
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double x2 = Math.pow(x,x);
        double y2 = Math.pow(y,y);
        double sum = x2+y2;
        double distance = Math.sqrt(sum);
        System.out.println("Distance is : "+distance);
    }
}
