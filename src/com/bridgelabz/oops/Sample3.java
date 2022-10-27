package com.bridgelabz.oops;
public class Sample3
{
    public static void main(String[] args)
    {
        System.out.println("***************************");
        System.out.println("Person class accessing by object via setter and getter method");
        System.out.println("Private variable outside the class by using setter and getter method");
            Person per = new Person();
            per.setName("Nagraj");
            per.setAge(20);
            per.setGender("Male");
            per.setAdhaarNumber("1234-1234-1234-1234");
            System.out.println(per.getName());
            System.out.println(per.getAge());
            System.out.println(per.getGender());
            System.out.println(per.getAdhaarNumber());

            Person obj = new Person();
            obj.setName("Panchal");
            obj.setAge(25);
            obj.setGender("Male");
            obj.setAdhaarNumber("1234-2434-4556-5673");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getGender());
        System.out.println(obj.getAdhaarNumber());

        System.out.println("***************************");
        System.out.println("Parent class inherited in student class and access through setter and getter method ");
        Student st = new Student(); // Object created for default constructor
        st.setStudentID(111);
        st.setName("Panchal");
        st.setCollageName("GPT");
        System.out.println(st.getStudentID()); // access Student private variable by using setter and getter method
        System.out.println(st.getName()); // access Parent class inherited in student class
        System.out.println(st.getCollageName());
        System.out.println();
        System.out.println("access non static method but private variables");
        st.displayStudentDetails();

        System.out.println("***************************");
        System.out.println("Access through parametrized constructor");
        Student stobj = new Student(706,72,"POLICE","BMSI"); // Parametrized constructor object created
        System.out.println(stobj.getStudentID()); // call parametrized constructor object
        System.out.println(stobj.getRollNumber());
        System.out.println(stobj.getDepartment());
        System.out.println(stobj.getCollageName());
        stobj.cityMethod();// access non-static method inside parametrized constructor



        System.out.println("***************************");
        System.out.println("Access Employee details");
        System.out.println("Constructor Object created access private variable via getter and setter method");
        Employee emp = new Employee();
        emp.setEmployeeID(16);
        emp.setSalary(54000);
        emp.setName("Nagraj");
        System.out.println(emp.getName()); // inherited getter method from Person class in Employee class
        System.out.println(emp.getEmployeeID()); // call getter method from employee class
        System.out.println(emp.getSalary());

        System.out.println("*****************************");
        System.out.println("access non-static method by using constructor object");
        emp.displayEmployeeDetails();
        emp.personDetails();
        emp.city="Bidar";
        emp.setDepartment("SDE");
        System.out.println(emp.getDepartment()); // Private variable access with setter and getter method
        System.out.println(emp.city); // Public variable access without setter and getter method
        System.out.println(emp.address); // Protected variable access within package without using setter and getter method


    }
}
