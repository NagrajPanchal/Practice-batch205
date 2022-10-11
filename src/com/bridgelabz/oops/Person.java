package com.bridgelabz.oops;

public class Person
{
    // Encapsulation
    private String name;
    private int age;
    private String  gender;
    private String adhaarNumber;

    public Person() {
    }

    public Person(String name, int age, String gender, String adhaarNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adhaarNumber = adhaarNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdhaarNumber() {
        return adhaarNumber;
    }

    public void setAdhaarNumber(String adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }

    void EmployeeDetailsConstructor()
    {
        new Person("Nagraj",29,"Male","1234-3454-2354");
    }

}
