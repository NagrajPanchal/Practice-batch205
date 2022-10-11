package com.bridgelabz.oops;

public class Student extends Person
{
private int studentID;
private int rollNumber;
private String department;
private String collageName;
protected String city;
public int age;



    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public Student() // Default constructor
    {
    }

    public Student(int studentID, int rollNumber, String department, String collageName)
{
    this.studentID = studentID;
    this.rollNumber = rollNumber;
    this.department = department;
    this.collageName = collageName;
}
void displayStudentDetails()
{
    System.out.println(studentID);
    System.out.println(rollNumber);
    System.out.println(department);
    System.out.println(collageName);
}
public void cityMethod()
{
    city = "Bengalore";
    System.out.println(city);
    Student stobj = new Student(212,1221,"CSE","Amareswara");
    System.out.println(stobj.studentID);
    System.out.println(stobj.rollNumber);
    System.out.println(stobj.department);
    System.out.println(stobj.collageName);

}

}
