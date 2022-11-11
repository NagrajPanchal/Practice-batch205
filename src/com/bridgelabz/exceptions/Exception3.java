package com.bridgelabz.exceptions;

import java.io.FileNotFoundException;

public class Exception3 {

    static void calculate(StudentPayroll studentPayroll) throws StudentPayrollException {
//
//        try {
//            studentPayroll.calculateSum();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            studentPayroll.calculateAvg();
        } catch (FileNotFoundException e) {
            throw new StudentPayrollException("file not found");
        } catch (InterruptedException e) {
            throw new StudentPayrollException("Interrupted");
        }


    }

    public static void main(String[] args)   {

        // Hotel Input format: -> Date Range (from-date and to-date)

        // Regular or rewarding
        // DateTime library // google
       // 23-05-2022  to 31-05-2022
       // 23 to 27 will be weekday => weekday rate
        // 28 and 29 are weekend => weekend rate
        // 30 and 31 are weekday => weekday rate

        StudentPayroll studentPayroll = new StudentPayroll(12345,"Amit",45,47);

        try {
            calculate(studentPayroll);
        } catch (StudentPayrollException e) {
            System.out.println("catch block " + e);
        }


    }
}
