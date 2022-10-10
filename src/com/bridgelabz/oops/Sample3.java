package com.bridgelabz.oops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Sample3
{
    public static void main(String[] args)
    {
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

    }
}
