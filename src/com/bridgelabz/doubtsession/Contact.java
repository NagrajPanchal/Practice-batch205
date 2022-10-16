package com.bridgelabz.doubtsession;

public class Contact extends Details
{
    @Override
    void m1()
    {
        System.out.println("m1()--> Contact class");
//        m1(); //
    }

    public Contact()
    {
        Details detailsObject = new Details("Nagraj", 973971384,"Bidar",585326);
        System.out.println(detailsObject.name);
        System.out.println(detailsObject.phoneNumber);
        System.out.println(detailsObject.address);
        System.out.println(detailsObject.pinCode);
        m1();
    }


    public static void main(String[] args)
    {
        Contact contactObj = new Contact();
        contactObj.m1();
        Details obj = new Details();
    }
}
