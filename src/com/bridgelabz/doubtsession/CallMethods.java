// Static and Non-Static methods

package com.bridgelabz.doubtsession; // Package

import com.bridgelabz.oops.Student;

public class CallMethods // Class
{
    public static void main(String[] args) // Main Method
    {
        StaticAndNonStaticMethod.staticMethod(); // Static Method : Outside the class by using class name
        StaticAndNonStaticMethod non = new StaticAndNonStaticMethod(); // Object Created
        non.nonStaticMethod(); // Non-Static Method : Outside the class create object by using object reference
        Student objStudent = new Student();
        objStudent.setStudentID(01);
        objStudent.setRollNumber(143);
        objStudent.setDepartment("CSE");
        objStudent.setCollageName("GNDECB");
        System.out.println(objStudent.getStudentID());
        System.out.println(objStudent.getRollNumber());
        System.out.println(objStudent.getDepartment());
        System.out.println(objStudent.getCollageName()); // Private setter and Getter method
        System.out.println(objStudent.age); // Public variable access any where inside and outside the package
//        System.out.println(objStudent.city);// Protected variable unable to access outside the package without setter & getter method

    }
}
