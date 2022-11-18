package com.bridgelabz.exceptions;

import java.io.File;
import java.util.Scanner;

public class ReadCSVExample1
{
    public static void main(String[] args) throws Exception
    {
//parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File("C:\\Users\\user\\Desktop\\bridgelabz\\Practice-batch205\\src\\com\\bridgelabz\\exceptions\\CSVDemo.csv"));
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner
    }
}
