package com.bridgelabz.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception2 {

    // Its a good practice to handle exactly that exception which is thrown from a try block.
    // Its not a good practice to handle using the parent exception class.
    static void m5() {
        try {
            FileReader fileReader = new FileReader("D:\\manu\\New folder (2)\\PerfiosLaptopData\\newfolder1\\RFPSample169\\src\\com\\bridgelaz\\exceptions\\abc.txt");
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){

        }
        catch (FileNotFoundException e) {
            System.out.println("catch block");
        }
        catch(IOException e){

        }



        System.out.println("m5 ending");
    }


    static void m6() throws FileNotFoundException {
        FileReader fileReader = new FileReader("D:\\manu\\New folder (2)\\PerfiosLaptopData\\newfolder1\\RFPSample169\\src\\com\\bridgelaz\\exceptions\\abc.txt");
        System.out.println("m6 ending");
    }


    public static void main(String[] args) {

        m5();

        try {
            m6();
        } catch (FileNotFoundException e) {
            System.out.println("catch block");
        }finally {
            // code cleanup activities
        }
        System.out.println("main ending");
    }
}
