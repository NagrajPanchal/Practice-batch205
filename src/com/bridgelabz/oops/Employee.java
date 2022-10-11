package com.bridgelabz.oops;

public class Employee extends Person
{
private int employeeID;
private String department;
private double salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() // default constructor
    {
    }

    public Employee(int employeeID, String department, double salary)
{
    this.employeeID = employeeID;
    this.department = department;
    this.salary = salary;
}
void displayEmployeeDetails()
{
    System.out.println("access by Constructor method");
    Employee em = new Employee(12,"CSE",34000);
    System.out.println(em.employeeID);
    System.out.println(em.department);
    System.out.println(em.salary);
    System.out.println("Access by setter and getter method");
    setEmployeeID(123);
    setDepartment("CSE");
    setSalary(42000);
    System.out.println(getEmployeeID());
    System.out.println(getDepartment());
    System.out.println(getSalary());
}


}
