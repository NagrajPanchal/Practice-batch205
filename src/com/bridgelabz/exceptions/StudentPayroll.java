package com.bridgelabz.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentPayroll {
    int phnNo;
    String name;

    int m1;

    int m2;


    public StudentPayroll() {

    }

    public StudentPayroll(int phnNo, String name, int m1, int m2) {
        this.phnNo = phnNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
    }

    public float calculateSum() throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("abc.txt");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            // clean-up activities
            System.out.println("finally block");
            fileReader.close();
        }

        int sum = m1 + m2;
        return sum;
    }

    float calculateAvg() throws FileNotFoundException, InterruptedException {


        FileReader fileReader = new FileReader("D:\\manu\\New folder (2)\\PerfiosLaptopData\\newfolder1\\RFPSample169\\src\\com\\bridgelabz\\exceptions\\abc.txt");
        Thread.sleep(1000);

        System.out.println(name + "...." + phnNo);
        float avg = 0.0f;
        try {
             avg =  (m1 + m2) / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        return avg;
    }
}
