package com.bridgelabz.practice;

public class EmployeeWage {

    // Naming convention
    // For class, interface ,enum => Pascal case(Eg:- EmployeeWage , Sample , EmployeePayroll)
    // For variables and methods => Camel case(Eg:- sum , averageSalary , calculateWage())
    // For constants => Uppercase with underscores(Eg:-WAGE_PER_HOUR)

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 12;
    static final int PART_TIME_HOUR = 6;

    static final int WORKING_DAYS_PER_MONTH = 20;

    static final int WORKING_HOURS_PER_MONTH = 100;

    static final int IS_FULL_TIME = 2;

    static final int IS_PART_TIME = 1;


    public static void main(String[] args) {
//        double var1 = Math.random();
//        System.out.println(var1);
//        double var = Math.floor(var1 * 10);
//        System.out.println(var);
//        int var2 = (int) var % 3;
//        System.out.println(var2);


        int day = 1;
        int totalWage = 0;
        int empHours = 0;
        while (day <= WORKING_DAYS_PER_MONTH && empHours <= WORKING_HOURS_PER_MONTH) {
            int dailyWage = 0;
            int employeeAttendence = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeAttendence) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Full time");
                    dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    empHours  = empHours + FULL_TIME_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part time");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    empHours  = empHours + PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Absent");
            }
            totalWage = totalWage + dailyWage;
            System.out.println("Daily Wage for => " + day + " day => " + dailyWage);
            day++;
        }

        System.out.println("Total Working Hours => " + empHours);
        System.out.println("Total Wage => " + totalWage);
    }
}
