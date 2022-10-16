package com.bridgelabz.doubtsession;

public class Details
{
String name;
long phoneNumber;
String address;
int pinCode;

    public Details()
    {
            System.out.println("constructor()--> Child class");
    }
    void m1()
    {
        System.out.println("m1()--> Child class");
    }

    public Details(String name, long phoneNumber, String address, int pinCode) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.pinCode = pinCode;
    }
}
