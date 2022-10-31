package com.bridgelabz.doubtsession;

public class HashCodeAndString
{
    public static void main(String[] args)
    {
        String str1 = "ABC";
        String str2 = "KGF";
        String str3 = str1;

        String str4 = new String("XYZ");
        String str5 = new String("KGF");

        System.out.println(str1 == str2); // false : ref diff obj
        System.out.println(str1 == str3); // true : same ref
        System.out.println(str1.equals(str2)); // false : ref diff obj
        System.out.println(str1.equals(str3)); // true same ref
        System.out.println(str1.hashCode()); // hash code same
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());//same
        System.out.println(str4.hashCode());
        System.out.println(str5.hashCode());

        System.out.println("String constant pool");
        str3 = "KGF2";
        System.out.println(str3);



    }
}
